import java.util.*;
import java.sql.*;

public class DatabaseHandler {
    private static final String DB_URL = "jdbc:sqlite:test.db";
    // public DatabaseHandler {
    //     createNewTable();
    // }
    // Constructor wont work bc it's "only allowed in record classes"

    // Connect to the Database
    private Connection connect() {
        Connection c = null;
        try {
            c = DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return c;
    }

    // Create the database table if it hasnt been done yet
    public void createNewTable() {
        String sql = "CREATE TABLE IF NOT EXISTS USERS " +
               "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
               "NAME TEXT NOT NULL, " +
               "EMAIL TEXT NOT NULL, " +
               "PASSWORD TEXT NOT NULL, " +
               "COUNTRY TEXT NOT NULL, " +
               "CITY TEXT NOT NULL, " +
               "SECTOR TEXT NOT NULL)";
 
        try (Connection c = connect();
            Statement stmt = c.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean checkUserExists(String name, String email) {
        String sql = "SELECT COUNT(*) FROM USERS WHERE NAME = ? OR EMAIL = ?";
        try (Connection c = connect();
            PreparedStatement pstmt = c.prepareStatement(sql)) {
                pstmt.setString(1, name);
                pstmt.setString(2, email);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void addUser(IDandPasswords.Register reg) {
        String sql = "INSTER INTO  USERS(NAME, EMAIL, PASSWORD, COUNTRY)";
        try (Connection c = connect();
             PreparedStatement pstmt = c.prepareStatement(sql)) {
            pstmt.setString(1, reg.name);
            pstmt.setString(2, reg.email);
            pstmt.setString(3, reg.password);
            pstmt.setString(4, reg.country);
            pstmt.setString(5, reg.city);
            pstmt.setString(6, reg.sector);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public HashMap<String, String> loadLoginInfo() {
        HashMap<String, String> loginInfo = new HashMap<>();
        String sql = "SELECT NAME, PASSWORD FROM USERS";

        try (Connection c = this.connect();
             Statement stmt = c.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                loginInfo.put(rs.getString("NAME"), rs.getString("PASSWORD"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return loginInfo;
    }
}
