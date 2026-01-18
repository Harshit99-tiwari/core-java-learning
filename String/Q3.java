package String;

public class Q3 {
    public static void main(String[] args) {
         String str1 = "tiwariankush656@gmail.com";
              int i = str1.indexOf("@");
              String username = str1.substring(0, i);
              System.out.println("USERNAME: "+username);
              int a = str1.indexOf(".");
              String domain = str1.substring(i,a);
              System.out.println("DOMAIN: "+domain);
              System.out.println(domain.compareTo(domain));
    }
}
