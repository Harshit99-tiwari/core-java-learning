package Conditional_Statements;

import java.util.Scanner;

public class IfandElse5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of three subject:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int total = m1 + m2 + m3;
        int avg = (total) / 3;
        if (avg >= 70) {
            System.out.println("Grade:A ");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Grade: B");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("Grade: C");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("Grade:D");
        } else {
            System.out.println("Grade:F");
        }
        sc.close();
    }
}
