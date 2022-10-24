package src.objects;

public class Seat {
    private int number;
    private char letter;
    private String type;

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

    public String getType() {
        return type;
    }
}
