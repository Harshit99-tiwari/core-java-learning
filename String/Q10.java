package String;

public class Q10 {
    public static void main(String[] args) {
        String str[] = { "hellallho", "all", "this", "isthis" };
        int largest = str[0].length();
        String largeststr = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() > largest) {
                largest = str[i].length();
                largeststr = str[i];
            }
        }
        System.out.println(largeststr);
    }
}
