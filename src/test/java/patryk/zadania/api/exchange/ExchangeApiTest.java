package patryk.zadania.api.exchange;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.net.ssl.SSLSession;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExchangeApiTest {

    private ExchangeApi api;

    @Mock
    private HttpClient client;

    @BeforeEach
    void setUp(){
        this.api = new ExchangeApi(client, new ObjectMapper());
    }


    @Test
    void getCourseForTest() throws IOException, InterruptedException {
        //given
        String baseCurrency = "USD";
        String destCurrency = "PLN";
        when(client.send(any(), any())).thenReturn(new HttpResponse<Object>() {
            @Override
            public int statusCode() {
                return 0;
            }

            @Override
            public HttpRequest request() {
                return null;
            }

            @Override
            public Optional<HttpResponse<Object>> previousResponse() {
                return Optional.empty();
            }

            @Override
            public HttpHeaders headers() {
                return null;
            }

            @Override
            public Object body() {
                return jsonResponse;
            }

            @Override
            public Optional<SSLSession> sslSession() {
                return Optional.empty();
            }

            @Override
            public URI uri() {
                return null;
            }

            @Override
            public HttpClient.Version version() {
                return null;
            }
        });
        //when
        double latestExchangeRateForCurrency = api.getLatestExchangeRateForCurrency(baseCurrency, destCurrency);
        //then
        assertEquals(4.23,latestExchangeRateForCurrency);
    }

    String jsonResponse = "{\n" +
            "  \"rates\": {\n" +
            "    \"CAD\": 1.5997,\n" +
            "    \"HKD\": 9.7384,\n" +
            "    \"ISK\": 121.9,\n" +
            "    \"PHP\": 64.82,\n" +
            "    \"DKK\": 7.4482,\n" +
            "    \"HUF\": 312.73,\n" +
            "    \"CZK\": 25.446,\n" +
            "    \"AUD\": 1.6048,\n" +
            "    \"RON\": 4.6593,\n" +
            "    \"SEK\": 10.1868,\n" +
            "    \"IDR\": 17045.27,\n" +
            "    \"INR\": 80.5105,\n" +
            "    \"BRL\": 4.0932,\n" +
            "    \"RUB\": 70.6897,\n" +
            "    \"HRK\": 7.442,\n" +
            "    \"JPY\": 130.47,\n" +
            "    \"THB\": 38.66,\n" +
            "    \"CHF\": 1.1739,\n" +
            "    \"SGD\": 1.6274,\n" +
            "    \"PLN\": 4.23,\n" +
            "    \"BGN\": 1.9558,\n" +
            "    \"TRY\": 4.9464,\n" +
            "    \"CNY\": 7.7924,\n" +
            "    \"NOK\": 9.5613,\n" +
            "    \"NZD\": 1.7029,\n" +
            "    \"ZAR\": 14.4937,\n" +
            "    \"USD\": 1.2411,\n" +
            "    \"MXN\": 22.8777,\n" +
            "    \"ILS\": 4.3317,\n" +
            "    \"GBP\": 0.87248,\n" +
            "    \"KRW\": 1336.99,\n" +
            "    \"MYR\": 4.8425\n" +
            "  },\n" +
            "  \"base\": \"EUR\",\n" +
            "  \"date\": \"2018-03-26\"\n" +
            "}";

}