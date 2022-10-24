package src.objects;

public class Flight {
    private int flightNum;
    private String airlineCode;
    private int numSeats;

    private String departure;
    private String destination;

    public Flight(int flightNum, String airlineCode, int numSeats, String departure, String destination) {
        this.flightNum = flightNum;
        this.airlineCode = airlineCode;
        this.numSeats = numSeats;
        this.departure = departure;
        this.destination = destination;
    }
}
