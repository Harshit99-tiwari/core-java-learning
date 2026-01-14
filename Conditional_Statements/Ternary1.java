package Conditional_Statements;

import java.util.Scanner;

public class Ternary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int marks = sc.nextInt();
        char grade = (marks <= 32) ? 'F' : (marks <= 60) ? 'C' : (marks <= 80) ? 'B' : 'A';
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
