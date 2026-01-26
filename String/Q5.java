package String;

public class Q5 {
    public static void main(String[] args) {
         String str = "HELLO HOW ARE YOU";
        String mirror = "";
        for(int i =str.length()-1;i>=0;i--){
            mirror =mirror+ str.charAt(i);
        }
        System.out.println(mirror);
    }
}
