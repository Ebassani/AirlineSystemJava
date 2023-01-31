package src;

import src.dao.AirportDAO;
import src.objects.*;


import java.sql.SQLException;

public class Main {
    public static void main(String arrgs[]) throws SQLException {
        Plane boing = new Plane("BO321", 216, 1);

        Airline finnAir = new Airline("Finnair", "FN", "Finland");

        Flight hel_fra = new Flight(112, finnAir.getCode(), "HEL", "FRA", boing);
        Seat[] seats = hel_fra.getSeats();

        System.out.println(hel_fra);


        if (false) {
            for (int i = 0; i < 216; i++) {
                String seatA = seats[i].getSeat();
                String seatB = seats[++i].getSeat();
                String seatD = seats[++i].getSeat();
                String seatE = seats[++i].getSeat();

                System.out.printf("%s %s | %s %s\n", seatA, seatB, seatD, seatE);
            }
        }

        User user = new User("Malandro");

        Airport[] airports = AirportDAO.getAirports().toArray(new Airport[0]);
        for (Airport airport : airports){
            System.out.println(airport);
        }

    }


}
