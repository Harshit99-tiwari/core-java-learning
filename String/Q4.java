package String;

public class Q4 {
    public static void main(String[] args) {
         String str = "programmer@gmail.com";
          System.out.println(str.substring(0,10));
          System.out.println(str.substring(11));
          System.out.println(str.matches("\\w*@gmail.com"));
    }
}
