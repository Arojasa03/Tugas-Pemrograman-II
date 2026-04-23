package aplikasipenjualan;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    public static Connection getKoneksi() {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_penjualan",
                "root",
                ""
            );
            return conn;
        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
            return null;
        }
    }
}