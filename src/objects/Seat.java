package src.objects;

public class Seat {

    private int type, reservationId;

    private String seat_code, reservationName, flightCode, planeCode;


    public Seat(String seat_code, String planeCode, int type) {
        this.seat_code = seat_code;
        this.planeCode = planeCode;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getSeat_code() {
        return seat_code;
    }

    public void setSeat_code(String seat_code) {
        this.seat_code = seat_code;
    }

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getPlaneCode() {
        return planeCode;
    }

    public void setPlaneCode(String planeCode) {
        this.planeCode = planeCode;
    }
}
