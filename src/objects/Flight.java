package src.objects;

public class Flight {
    private int flightNum;
    private String airlineCode, departure, destination;
    private Plane plane;

    public Flight(int flightNum, String airlineCode, String departure, String destination,
                  String planeCode, Plane plane) {
        this.flightNum = flightNum;
        this.airlineCode = airlineCode;
        this.departure = departure;
        this.destination = destination;
        this.plane = plane;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public Plane getPlane() {
        return plane;
    }
}
