package src.objects;

public class Flight {
    private int flightNum, numSeats, seatType;
    private String airlineCode, departure, destination, planeCode;

    public Flight(int flightNum, int numSeats, int seatType, String airlineCode, String departure,
                  String destination, String planeCode) {
        this.flightNum = flightNum;
        this.numSeats = numSeats;
        this.seatType = seatType;
        this.airlineCode = airlineCode;
        this.departure = departure;
        this.destination = destination;
        this.planeCode = planeCode;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getSeatType() {
        return seatType;
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

    public String getPlaneCode() {
        return planeCode;
    }
}
