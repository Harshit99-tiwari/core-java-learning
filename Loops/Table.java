package Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TABLE OF ANY NUMBER

        System.out.print("enter the number: ");
        int i = sc.nextInt();
        for (int n = 1; n <= 10; n++) {
            System.out.println(i + "x" + n + "=" + i * n);
        }
        sc.close();
    }
}
