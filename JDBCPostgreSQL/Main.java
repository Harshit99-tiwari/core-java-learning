import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "H@rshit"
            );

            System.out.println("Connected successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}