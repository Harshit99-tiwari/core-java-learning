package String;

public class Q9 {
    public static void main(String[] args) {
        String str[] = { "eLL", "aLLS", "iWt", "oR", "urr" };
        int vowelcount = 0;
        for (int i = 0; i < str.length; i++) {
            char C[] = str[i].toCharArray();
            if (C[0] == 'a' || C[0] == 'e' || C[0] == 'i' || C[0] == 'o' || C[0] == 'u') {
                vowelcount++;
            }
        }
        System.out.println(vowelcount);
    }
}
