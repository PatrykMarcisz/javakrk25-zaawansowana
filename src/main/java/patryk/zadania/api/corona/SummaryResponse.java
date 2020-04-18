package patryk.zadania.api.corona;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SummaryResponse {

    @JsonProperty("Global")
    private Global global;

    @JsonProperty("Countries")
    private List<Country> countries;

    @JsonProperty("Date")
    private String date;

    //gettery, settery,
    //toString
    //bezargumentowy i wszystkie argumenty konstruktor

    public SummaryResponse(Global global, List<Country> countries, String date) {
        this.global = global;
        this.countries = countries;
        this.date = date;
    }

    public SummaryResponse() {
    }

    public patryk.zadania.api.corona.Global getGlobal() {
        return global;
    }

    public void setGlobal(patryk.zadania.api.corona.Global global) {
        this.global = global;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SummaryResponse{" +
                "Global=" + global +
                ", Countries=" + countries +
                ", Date='" + date + '\'' +
                '}';
    }
}
