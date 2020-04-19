package patryk.zadania.api.exchange;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.Set;

public class HttpApiTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient exchangeRateClient = HttpClient.newBuilder().build();
        ObjectMapper mapper = new ObjectMapper()
                .configure(
                        DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                        false
                );

        Set<String> availableCurrencies = getAvailableCurrencies(exchangeRateClient, mapper);
        Scanner scanner = new Scanner(System.in);
        System.out.println(availableCurrencies);

        System.out.print("Wprowadz walutę bazową: ");
        String baseCurrency = validateCurrencyCode(availableCurrencies, scanner);

        System.out.print("Podaj kwotę: ");
        double ammount = Double.parseDouble(scanner.nextLine());

        System.out.print("Wprowadz walutę docelową: ");
        String destCurrency = validateCurrencyCode(availableCurrencies, scanner);

        double course = getCourseFor(exchangeRateClient, mapper, baseCurrency, destCurrency);
        System.out.println("kurs to: " + (course * ammount));
        // /latest?base=USD&symbols=PLN,EUR
    }

    public static double getCourseFor(HttpClient client, ObjectMapper mapper,
                                       String baseCurrency, String destCurrency) throws IOException, InterruptedException {
        System.out.println(baseCurrency);
        System.out.println(destCurrency);
        HttpRequest request = HttpRequest.newBuilder()
                .GET() //POST //PUT //DELETE
                .uri(URI.create("https://api.exchangeratesapi.io/latest?base=" + baseCurrency + "&symbols=" + destCurrency))
                .build();
        String response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        return mapper.readValue(response, Exchange.class).getRates().get(destCurrency);
    }

    private static String validateCurrencyCode(Set<String> availableCurrencies, Scanner scanner) {
        String baseCurrency = scanner.nextLine();
        while(!availableCurrencies.contains(baseCurrency)){
            System.out.println("nieprawidłowa, spróbuj ponownie: ");
            baseCurrency = scanner.nextLine();
        }
        return baseCurrency;
    }

    public static Set<String> getAvailableCurrencies(HttpClient client, ObjectMapper mapper) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET() //POST //PUT //DELETE
                .uri(URI.create("https://api.exchangeratesapi.io/latest"))
                .build();
        String response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        return mapper.readValue(response, Exchange.class).getRates().keySet();
    }
}
