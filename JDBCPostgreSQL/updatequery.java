import java.sql.*;
public class updatequery {
      public static void main(String[] args) {
         String sql =  "update student set name = 'Max' where sid=5";
        try{
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/collegedb",
            "postgres", 
            "H@rshit");
        Statement st = con.createStatement();
       st.execute(sql);
        
        con.close();
    }
    catch(Exception e){}
}
}
