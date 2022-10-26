package src.objects;

public class Airport {
    private String city, country, code, countryCode;

    public Airport(String city, String country, String code, String countryCode) {
        this.city = city;
        this.country = country;
        this.code = code;
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getCode() {
        return code;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
