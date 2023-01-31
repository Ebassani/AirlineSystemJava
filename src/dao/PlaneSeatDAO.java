package src.dao;

import src.ConnectionManager;
import src.objects.Airport;
import src.objects.Seat;

import java.sql.*;
import java.util.ArrayList;

public class PlaneSeatDAO {
    private static final Connection conn;

    static {
        try {
            conn = ConnectionManager.getConn();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Seat> getPlaneSeats(String planeCode) {
        ArrayList<Seat> seats = new ArrayList<>();

        try {
            PreparedStatement st = conn.prepareStatement(
                    "SELECT * FROM plane_seat WHERE plane_code = ? "
            );
            st.setString(1, planeCode);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String seatCode = rs.getString("seat_code");
                int type = rs.getInt("type");

                seats.add(new Seat(seatCode,planeCode, type));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return seats;
    }

    public static void createSeat(Seat seat) {
        try {
            PreparedStatement statement = conn.prepareStatement(
                    "INSERT INTO plane_seat (seat_code, plane_code, type) " +
                            "VALUES (?,?,?)"
            );
            statement.setString(1, seat.getSeat_code());
            statement.setString(2, seat.getPlaneCode());
            statement.setInt(3, seat.getType());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createSeats(Seat[] seats) {
        for (Seat seat: seats) {
            createSeat(seat);
        }
    }
}
