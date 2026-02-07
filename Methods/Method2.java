package Methods;

public class Method2 {
    static String username(String email) {
        int a = email.indexOf("@");
        String name = email.substring(0, a);
        return name;
    }

    public static void main(String[] args) {
        String email = "harshit@gmail.com";
        System.out.println(username(email));
    }
}
