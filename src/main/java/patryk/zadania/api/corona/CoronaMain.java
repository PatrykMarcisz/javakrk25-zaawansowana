package patryk.zadania.api.corona;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoronaMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.covid19api.com/summary"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        SummaryResponse summaryResponse = mapper.readValue(response.body(), SummaryResponse.class);
        System.out.println(summaryResponse);
        double sum = summaryResponse.getCountries().stream()
                .mapToDouble(x -> Double.parseDouble(x.getNewConfirmed()))
                .sum();

        double sum2 = summaryResponse.getCountries().stream()
                .map(x -> x.getNewConfirmed())
                .map(x -> Double.parseDouble(x))
                .reduce(Double::sum).get();
        System.out.println(summaryResponse.getGlobal().getNewConfirmed());
        System.out.println(sum);


    }
}
