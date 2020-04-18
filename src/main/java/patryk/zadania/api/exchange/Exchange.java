package patryk.zadania.api.exchange;

import java.util.Map;


public class Exchange {
    private Map<String, Double> rates;
    private String base;
    private String date;

    public Exchange(Map<String, Double> rates, String base, String date) {
        this.rates = rates;
        this.base = base;
        this.date = date;
    }

    public Exchange(){

    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public String getBase() {
        return base;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "rates=" + rates +
                ", base='" + base + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
