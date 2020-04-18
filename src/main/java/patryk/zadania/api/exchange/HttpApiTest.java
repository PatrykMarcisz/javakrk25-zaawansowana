package patryk.zadania.api.exchange;

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
                .uri(URI.create("https://api.exchangeratesapi.io/2018-03-26"))
                .build();
        HttpResponse<String> response = exchangeRateClient.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);
    }
}
