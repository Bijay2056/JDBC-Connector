import java.sql.*;

public class stdinfo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentinfo";
        String username = "root";
        String password = "@Bijay123";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM std_db");

            while (rs.next()) {
                // Process each row of the result set
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
