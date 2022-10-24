package src.objects;

public class Airline {
    private static int id;
    private String name, code, country;

    public Airline(int id, String name, String code, String country) {
        this.id = id;
        id++;
        this.name = name;
        this.code = code;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }
}
