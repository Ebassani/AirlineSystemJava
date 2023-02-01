package src.dao;

import src.ConnectionManager;
import src.objects.Plane;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlaneDAO {
    private static final Connection conn;

    static {
        try {
            conn = ConnectionManager.getConn();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Plane> getPlanes() {
        ArrayList<Plane> planes = new ArrayList<>();
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM plane");

            while (rs.next()) {
                Plane plane = new Plane();
                String code = rs.getString("iatacode");
                int id = rs.getInt("id");
                plane.setId(id);
                plane.setPlaneCode(code);

                planes.add(plane);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return planes;
    }
}
