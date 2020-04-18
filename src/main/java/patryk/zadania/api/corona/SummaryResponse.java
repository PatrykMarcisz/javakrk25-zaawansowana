package patryk.zadania.api.corona;

import java.util.List;

public class SummaryResponse {
    private Global Global;
    private List<Country> Countries;
    private String Date;

    //gettery, settery,
    //toString
    //bezargumentowy i wszystkie argumenty konstruktor

    public SummaryResponse(Global global, List<Country> countries, String date) {
        Global = global;
        Countries = countries;
        Date = date;
    }

    public SummaryResponse() {
    }

    public patryk.zadania.api.corona.Global getGlobal() {
        return Global;
    }

    public void setGlobal(patryk.zadania.api.corona.Global global) {
        Global = global;
    }

    public List<Country> getCountries() {
        return Countries;
    }

    public void setCountries(List<Country> countries) {
        Countries = countries;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "SummaryResponse{" +
                "Global=" + Global +
                ", Countries=" + Countries +
                ", Date='" + Date + '\'' +
                '}';
    }
}
