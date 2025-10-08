
import java.sql.*;

public class database {

   // Check user credentials in USERS table
   public static boolean checkUserCredentials(String name, String password) {
      Connection c = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      boolean valid = false;
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:test.db");
         String sql = "SELECT * FROM USERS WHERE NAME = ? AND PASSWORD = ?";
         pstmt = c.prepareStatement(sql);
         pstmt.setString(1, name);
         pstmt.setString(2, password);
         rs = pstmt.executeQuery();
         if (rs.next()) {
            valid = true;
         }
         rs.close();
         pstmt.close();
         c.close();
      } catch (Exception e) {
         System.err.println("Error checking credentials: " + e.getMessage());
      }
      return valid;
   }

   // Create USERS table with registration fields
   public static void main(String args[]) {
      Connection c = null;
      Statement stmt = null;
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:test.db");
         System.out.println("Opened database successfully");

         stmt = c.createStatement();
         String sql = "CREATE TABLE IF NOT EXISTS USERS " +
               "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
               "NAME TEXT NOT NULL, " +
               "EMAIL TEXT NOT NULL, " +
               "PASSWORD TEXT NOT NULL, " +
               "COUNTRY TEXT NOT NULL, " +
               "CITY TEXT NOT NULL, " +
               "SECTOR TEXT NOT NULL)";
         stmt.executeUpdate(sql);
         stmt.close();
         c.close();
      } catch (Exception e) {
         System.err.println(e.getClass().getName() + ": " + e.getMessage());
         System.exit(0);
      }
      System.out.println("USERS table created successfully");
   }

   // Insert user registration data into USERS table
   public static boolean insertUser(String name, String email, String password, String country, String city, String sector) {
      Connection c = null;
      PreparedStatement pstmt = null;
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:test.db");
         String sql = "INSERT INTO USERS (NAME, EMAIL, PASSWORD, COUNTRY, CITY, SECTOR) VALUES (?, ?, ?, ?, ?, ?)";
         pstmt = c.prepareStatement(sql);
         pstmt.setString(1, name);
         pstmt.setString(2, email);
         pstmt.setString(3, password);
         pstmt.setString(4, country);
         pstmt.setString(5, city);
         pstmt.setString(6, sector);
         pstmt.executeUpdate();
         pstmt.close();
         c.close();
         return true;
      } catch (Exception e) {
         System.err.println("Error inserting user: " + e.getMessage());
         return false;
      }
   }
}