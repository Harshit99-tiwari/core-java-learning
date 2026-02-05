package String;

public class Q11 {
    public static void main(String[] args) {
        String word = "Madam";
        String newword = word.toLowerCase();
        String rev = "";
        for (int i = newword.length() - 1; i >= 0; i--) {
            rev = rev + newword.charAt(i);

        }
        if (newword.equals(rev)) {
            System.out.println("palindrome string");
        } else {
            System.out.println("not palindrome");
        }
    }
}
