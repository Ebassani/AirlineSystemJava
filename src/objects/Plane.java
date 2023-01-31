package src.objects;

import src.functions.utilities;

public class Plane {
    private int id;
    private String planeCode;
    private Seat[] seats;

    public Plane(String planeCode, Seat[] seats) {
        this.planeCode = planeCode;
        this.seats = seats;
    }

    public String getPlaneCode() {
        return planeCode;
    }

    public Seat[] getSeats() {
        return seats;
    }
}
