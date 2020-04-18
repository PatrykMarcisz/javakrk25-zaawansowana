package patryk.zadania.api.corona;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {
    @JsonProperty("Country")
    private String country;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("Slug")
    private String slug;
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
    @JsonProperty("Date")
    private String date;

    public Country() {
    }

    @Override
    public String toString() {
        return "Country{" +
                "Country='" + country + '\'' +
                ", CountryCode='" + countryCode + '\'' +
                ", Slug='" + slug + '\'' +
                ", NewConfirmed='" + newConfirmed + '\'' +
                ", TotalConfirmed='" + totalConfirmed + '\'' +
                ", NewDeaths='" + newDeaths + '\'' +
                ", TotalDeaths='" + totalDeaths + '\'' +
                ", NewRecovered='" + newRecovered + '\'' +
                ", TotalRecovered='" + totalRecovered + '\'' +
                ", Date='" + date + '\'' +
                '}';
    }

    public Country(String country, String countryCode, String slug, String newConfirmed, String totalConfirmed, String newDeaths, String totalDeaths, String newRecovered, String totalRecovered, String date) {
        this.country = country;
        this.countryCode = countryCode;
        this.slug = slug;
        this.newConfirmed = newConfirmed;
        this.totalConfirmed = totalConfirmed;
        this.newDeaths = newDeaths;
        this.totalDeaths = totalDeaths;
        this.newRecovered = newRecovered;
        this.totalRecovered = totalRecovered;
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
