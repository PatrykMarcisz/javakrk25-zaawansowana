package patryk.zadania.api.corona;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Global {
    @JsonProperty("NewConfirmed")
    private String newConfirmed;
    @JsonProperty("TotalConfirmed")
    private String totalConfirmed;
    @JsonProperty("NewDeaths")
    private String newDeaths;
    @JsonProperty("TotalDeaths")
    private String totalDeaths;
    @JsonProperty("NewRecovered")
    private String newRecovered;
    @JsonProperty("TotalRecovered")
    private String totalRecovered;

    public Global() {
    }

    public Global(String newConfirmed, String totalConfirmed, String newDeaths, String totalDeaths, String newRecovered, String totalRecovered) {
        this.newConfirmed = newConfirmed;
        this.totalConfirmed = totalConfirmed;
        this.newDeaths = newDeaths;
        this.totalDeaths = totalDeaths;
        this.newRecovered = newRecovered;
        this.totalRecovered = totalRecovered;
    }

    @Override
    public String toString() {
        return "Global{" +
                "NewConfirmed='" + newConfirmed + '\'' +
                ", TotalConfirmed='" + totalConfirmed + '\'' +
                ", NewDeaths='" + newDeaths + '\'' +
                ", TotalDeaths='" + totalDeaths + '\'' +
                ", NewRecovered='" + newRecovered + '\'' +
                ", TotalRecovered='" + totalRecovered + '\'' +
                '}';
    }

    public String getNewConfirmed() {
        return newConfirmed;
    }

    public void setNewConfirmed(String newConfirmed) {
        this.newConfirmed = newConfirmed;
    }

    public String getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(String totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public String getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    public String getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public String getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(String newRecovered) {
        this.newRecovered = newRecovered;
    }

    public String getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(String totalRecovered) {
        this.totalRecovered = totalRecovered;
    }
}
