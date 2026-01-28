package Loops;

public class OneCount {
    public static void main(String[] args) {
        int num = 101301;
        int count = 0;
        while (num > 0) {
            int ld = num % 10;
            num = num / 10;
            if (ld == 1) {
                count++;
            }
        }
        System.out.println("Count of 1s: " + count);
    }
}
