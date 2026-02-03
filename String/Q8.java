package String;

public class Q8 {
    public static void main(String[] args) {
        String str[] = { "HELL", "ALLS", "HOW", "AR", "Y" };
        int Evennumbercharacter = 0;
        for (int i = 0; i < str.length; i++) {
            char c[] = str[i].toCharArray();

            if (c.length % 2 == 0) {
                Evennumbercharacter++;
            }
        }
        System.out.println(Evennumbercharacter);
    }
}
