package src.functions;

import src.objects.Airport;
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

    public static double airportDistance(Airport from, Airport to) {
        double lonFrom = Math.toRadians(from.getLongitude());
        double latFrom = Math.toRadians(from.getLatitude());
        double lonTo = Math.toRadians(to.getLongitude());
        double latTo = Math.toRadians(to.getLatitude());

        double distLon = lonTo - lonFrom;
        double distLat = latTo - latFrom;

        double a = Math.pow(Math.sin(distLat / 2), 2)
                + Math.cos(latFrom) * Math.cos(latTo)
                * Math.pow(Math.sin(distLon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        double r = 6371;

        return(c * r);
    }
}
