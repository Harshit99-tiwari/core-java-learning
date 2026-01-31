package Loops;

import java.util.Scanner;

public class Digitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            sum = sum +n;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
