import java.sql.*;
public class demoJDBC {
     public static void main(String[] args) {
        String sql =  "select *  from  student";
        try{
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/collegedb",
            "postgres",
            "H@rshit");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
     //   System.out.println(rs.next());
   // String name = rs.getString("name");//Fetching one row
   // System.out.println("name of student  is :"+name);
   while(rs.next()){
    System.out.print(rs.getInt(1)+" - ");
    System.out.print(rs.getString(2)+" - ");
    System.out.println(rs.getInt(3));
   }
    
    
            con.close();
        }
        catch(Exception e){}
     }
}
