package Loops;

public class Nestedloop4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println("");
        }
    }
}
