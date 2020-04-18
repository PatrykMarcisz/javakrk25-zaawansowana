package patryk.zadania.api.exchange;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpApiTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient exchangeRateClient = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.exchangeratesapi.io/latest"))
                .build();
        HttpResponse<String> response = exchangeRateClient.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Exchange exchange = mapper.readValue(response.body(), Exchange.class);
        System.out.println(exchange);
        String base = exchange.getBase();
        Double pln = exchange.getRates().get("PLN");
        System.out.println(base);
        System.out.println(pln);
    }
}
