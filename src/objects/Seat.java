package src.objects;

public class Seat {

    private int number, reservationId;
    private char letter;
    private String type, reservationName, flightCode;

    boolean reserved;


    public Seat(int number, char letter, String type) {
        this.number = number;
        this.letter = letter;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public char getLetter() {
        return letter;
    }

    public String getSeat() {
        return String.valueOf(number) + letter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserve(int id, String name) {
        this.reserved = true;
        this.reservationId = id;
        this.reservationName = name;
    }

    public String[] getReservation() {
        if (this.reserved) {
            return new String[]{this.reservationName, String.valueOf(this.reservationId)};
        }
        return new String[0];
    }
}
