package src.objects;

import src.functions.utilities;

public class Plane {
    private static int count;

    private int id;
    private String planeCode;
    private Seat[] seats;


    public Plane(String planeCode, int numSeats, int seatType) {
        this.id = count++;
        this.planeCode = planeCode;
        this.seats = utilities.arrangeSeats(numSeats, seatType);
    }

    public String getPlaneCode() {
        return planeCode;
    }

    public Seat[] getSeats() {
        return seats;
    }
}
