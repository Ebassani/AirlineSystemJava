package src.dao;

import src.ConnectionManager;
import src.objects.Airport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AirportDAO {
    private static Connection conn;

    static {
        try {
            conn = ConnectionManager.getConn();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Airport> getAirports() throws SQLException {
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM airport");

        ArrayList<Airport> airports = new ArrayList<>();
        while (rs.next()) {
            String iata = rs.getString("iatacode");
            String city = rs.getString("city");
            String country = rs.getString("country");
            int gmt = rs.getInt("gmt");
            airports.add(new Airport(city, country, iata, gmt));
        }

        return airports;
    }

    public static void createAirport(Airport airport) {
        try {
            PreparedStatement statement = conn.prepareStatement(
                    "INSERT INTO airport (iatacode, city, gmt, country) VALUES (?,?,?,?)");
            statement.setString(1, airport.getIataCode());
            statement.setString(2, airport.getCity());
            statement.setInt(3, airport.getGmt());
            statement.setString(4, airport.getCountry());
            statement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

