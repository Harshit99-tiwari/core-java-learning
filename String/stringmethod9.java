package String;

public class stringmethod9 {
    public static void main(String[] args) {
         
           //META CHARACTER
           String str1 = "5";
           System.out.println(str1.matches("\\w"));
           
           String str11 = "5";
           System.out.println(str11.matches("\\d"));
           System.out.println(str11.matches("\\w"));
           String str2 = "@";
           System.out.println(str2.matches("\\D"));
           System.out.println(str2.matches("\\W"));
           
           String str3 = "";
           System.out.println(str3.matches("\\s"));
           System.out.println(str3.matches("\\S"));
        
    }
}
