package String;

public class stringmethod8 {
    public static void main(String[] args) {
        String str = "@";
        System.out.println(str.matches("."));

        String str1 = "p";
        System.out.println(str1.matches("[abc]"));

        String str5 = "p";
        System.out.println(str5.matches("[^abc]"));

        String str6 = "4";
        System.out.println(str6.matches("[A-B3-9]"));

        String str9 = "aB9b";
        System.out.println(str9.matches("[a-z][A-C][0-9][a-z]"));

        


    }
}
