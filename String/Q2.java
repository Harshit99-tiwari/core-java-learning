package String;

public class Q2 {
    public static void main(String[] args) {
        int b = 1100110;
        String str = String.valueOf(b);
        System.out.println(str);
        System.out.println(str.matches("[01]+"));

        String str1 = "224AB";
        System.out.println(str1.matches("[0-9A-F]+"));
        
        String str3 = "01/12/2000";
        System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
