package src.dao;

import src.ConnectionManager;
import src.objects.Airport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AirportDAO {
    private static final Connection conn;

    static {
        try {
            conn = ConnectionManager.getConn();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Airport> getAirports() {
        ArrayList<Airport> airports = new ArrayList<>();

        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM airport");

            while (rs.next()) {
                String iata = rs.getString("iatacode");
                String city = rs.getString("city");
                String country = rs.getString("country");
                int gmt = rs.getInt("gmt");
                double latitude = rs.getDouble("latitude");
                double longitude = rs.getDouble("longitude");
                airports.add(new Airport(city, country, iata, gmt, latitude, longitude));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return airports;
    }

    public static void createAirport(Airport airport) {
        try {
            PreparedStatement statement = conn.prepareStatement(
                    "INSERT INTO airport (iatacode, city, gmt, country, longitude, latitude) " +
                            "VALUES (?,?,?,?,?,?)"
            );
            statement.setString(1, airport.getIataCode());
            statement.setString(2, airport.getCity());
            statement.setInt(3, airport.getGmt());
            statement.setString(4, airport.getCountry());
            statement.setDouble(5, airport.getLongitude());
            statement.setDouble(6, airport.getLatitude());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Airport getAirportIata(String iata) {
        Airport airport = new Airport();
        try {
            PreparedStatement statement = conn.prepareStatement(
                    "SELECT * FROM airport WHERE iatacode = ? LIMIT 1"
            );
            statement.setString(1, iata);

            ResultSet rs = statement.executeQuery();
            rs.next();
            airport.setIataCode(rs.getString("iatacode"));
            airport.setCity(rs.getString("city"));
            airport.setGmt(rs.getInt("gmt"));
            airport.setCountry(rs.getString("country"));
            airport.setLongitude(rs.getDouble("longitude"));
            airport.setLatitude(rs.getDouble("latitude"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return airport;
    }
}

