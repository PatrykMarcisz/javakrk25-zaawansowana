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

public class ExchangeApi {

    HttpClient httpClient;
    ObjectMapper mapper;

    public ExchangeApi() {
        this.httpClient = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper()
                .configure(
                        DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                        false
                );
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        consoleVersion();
    }

    private static void consoleVersion() throws IOException, InterruptedException {
        ExchangeApi test = new ExchangeApi();

        Set<String> availableCurrencies = test.getAvailableCurrencies();
        Scanner scanner = new Scanner(System.in);
        System.out.println(availableCurrencies);

        System.out.print("Wprowadz walutę bazową: ");
        String baseCurrency = test.validateCurrencyCode(availableCurrencies, scanner);

        System.out.print("Podaj kwotę: ");
        double ammount = Double.parseDouble(scanner.nextLine());

        System.out.print("Wprowadz walutę docelową: ");
        String destCurrency = test.validateCurrencyCode(availableCurrencies, scanner);

        double course = test.getLatestCourseForCurrency(baseCurrency, destCurrency);
        System.out.println("kurs to: " + (course * ammount));
        // /latest?base=USD&symbols=PLN,EUR
    }

    public double getLatestCourseForCurrency(String baseCurrency, String destCurrency) throws IOException, InterruptedException {
        String response = getResponseFromAPI("/latest?base=" + baseCurrency + "&symbols=" + destCurrency);
        return mapper.readValue(response, Exchange.class).getRates().get(destCurrency);
    }

    public double getCourseForDate(
            String baseCurrency, String destCurrency, String date) throws IOException, InterruptedException {
        String response = getResponseFromAPI("/" + date + "?base=" + baseCurrency + "&symbols=" + destCurrency);
        return mapper.readValue(response, Exchange.class).getRates().get(destCurrency);
    }

    private String validateCurrencyCode(Set<String> availableCurrencies, Scanner scanner) {
        String baseCurrency = scanner.nextLine();
        while (!availableCurrencies.contains(baseCurrency)) {
            System.out.println("nieprawidłowa, spróbuj ponownie: ");
            baseCurrency = scanner.nextLine();
        }
        return baseCurrency;
    }

    public Set<String> getAvailableCurrencies() throws IOException, InterruptedException {
        String response = getResponseFromAPI("/latest");
        return mapper.readValue(response, Exchange.class).getRates().keySet();
    }

    private String getResponseFromAPI(String enpoint) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET() //POST //PUT //DELETE
                .uri(URI.create("https://api.exchangeratesapi.io" + enpoint))
                .build();
        return httpClient.send(request, HttpResponse.BodyHandlers.ofString()).body();
    }
}
