package src.objects;

public class Airport {
    private String city, country, iataCode;
    private int gmt;

    private double latitude, longitude;

    public Airport(String city, String country, String iataCode, int gmt, double latitude, double longitude) {
        this.city = city;
        this.country = country;
        this.iataCode = iataCode;
        this.gmt = gmt;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Airport(){}

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

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public void setGmt(int gmt) {
        this.gmt = gmt;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
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
