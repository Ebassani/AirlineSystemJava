package src.functions;

import src.objects.Seat;
import src.objects.User;

public class utilities {
    public static Seat[] arrangeSeats(int numSeats, int type) {
        Seat[] seats = new Seat[numSeats];
        switch (type) {
            case 1:
                seats = seatType1(seats, numSeats);
                break;
        }

        return seats;
    }

    private static Seat[] seatType1(Seat[] seats, int numSeats) {
        int total = 0;
        int row = 1;
        char[] letters = {'A', 'B', 'D', 'E'};

        while (total < numSeats) {
            for (char letter : letters) {
                if (total == numSeats) {
                    break;
                }
                seats[total] = new Seat(row, letter, "ECONOMY");

                total++;
            }
            row++;
        }
        return seats;
    }

    public static Seat[] reserveSeat(Seat[] seats, int number, char letter, User u) {

        for (Seat seat : seats) {
            if (seat.getNumber() != number || seat.getLetter() != letter) {
                continue;
            }

            seat.reserve(u.getId(), u.getName());
            break;
        }
        return seats;
    }
}
