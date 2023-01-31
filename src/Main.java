package src;

import src.dao.AirportDAO;
import src.functions.utilities;
import src.objects.*;

public class Main {
    public static void main(String[] args) {
        Plane boeing = new Plane("BO321", 216, 1);

        Airline finnAir = new Airline("Finnair", "FN", "Finland");

        Flight hel_fra = new Flight(112, finnAir.getCode(), "HEL", "FRA", boeing);
        Seat[] seats = hel_fra.getSeats();

        System.out.println(hel_fra);

        Airport porto = new Airport("Porto Alegre","Brazil","POA", -3, -30.066666666667, -51.183333333333);
        //AirportDAO.createAirport(porto);
        Airport sp = new Airport("São Paulo","Brazil","GRU", -3, -23.5, -46.616666666667);
        //AirportDAO.createAirport(sp);

        Airport air = AirportDAO.getAirportIata("POA");
        System.out.println(air);

        System.out.println(utilities.airportDistance(porto, sp));
        Airport[] airports = AirportDAO.getAirports().toArray(new Airport[0]);
        for (Airport airport : airports){
            System.out.println(airport);
        }

    }


}
