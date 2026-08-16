import java.sql.*;
public class preparedstmnt {
    public static void main(String[] args) {
        int sid = 5;
        String name = "ritik";
        int marks = 99;

         String sql =  "insert into student values(?,?,?)";
        try{
            
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/collegedb",
            "postgres", 
            "H@rshit");
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2, name);
        st.setInt(3, marks);
        st.execute();
      
        
        con.close();
    }
    catch(Exception e){}
}
}
