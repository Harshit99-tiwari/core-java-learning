package Conditional_Statements;

import java.util.Scanner;

public class IfandElse8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number n: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("EVEN NUMBER");
        } else {
            System.out.println("ODD NUMBER");
        }
        sc.close();
    }
}
