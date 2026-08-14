import java.sql.*;
public class ins {
    public static void main(String[] args) {
         String sql =  "insert into student values(5,'John',58)";
        try{
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/collegedb",
            "postgres", 
            "H@rshit");
        Statement st = con.createStatement();
        boolean status =  st.execute(sql);
        System.out.println(status);
        con.close();
    }
    catch(Exception e){}
}
}
