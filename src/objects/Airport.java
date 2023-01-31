package src.objects;

public class Airport {
    private String city, country, iataCode;
    private int gmt;

    private double latitude, longitude;

    public Airport(String city, String country, String iataCode, int gmt) {
        this.city = city;
        this.country = country;
        this.iataCode = iataCode;
        this.gmt = gmt;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getIataCode() {
        return iataCode;
    }

    public int getGmt() {
        return gmt;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", iataCode='" + iataCode + '\'' +
                ", gmt=" + gmt +
                '}';
    }
}
