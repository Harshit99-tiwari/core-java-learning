package String;

public class stringmethod10 {
    public static void main(String[] args) {
        String str1 = "abc6@%  def";
        System.out.println(str1.matches(".  "));

        String str2 = "abcde5f";
        System.out.println(str2.matches("[a-z]  "));

        String str3 = "aavvcbsfdhbfgjfgjdftyjhfdklfsah";
        System.out.println(str3.matches("[a-z]  "));

        String str4 = "aaccbbccbbaa";
        System.out.println(str4.matches("[abc]+"));
        System.out.println(str4.matches("[abc]+"));

        String str5 = "";
        System.out.println(str5.matches("[abc]   "));

        String str6 = "aab";
        System.out.println(str6.matches("[abc]{3}"));

        String str7 = "pxs";
        System.out.println(str7.matches("[a-z]{3}"));

        String str9 = "aabbc"; // abcde
        System.out.println(str9.matches("[a-z]{1,5}"));

        String str8 = "harshit196@gmail.com";
        System.out.println(str8.matches(".   "));
        System.out.println(str8.matches(".   gmail.   "));
        System.out.println(str8.matches("\\w   @gmail(.   )"));

    }
}
