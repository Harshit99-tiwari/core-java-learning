package Basics;

import java.util.Scanner;

public class findingroots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // finding roots using enter the coefficients of quadratic equation
        int a, b, c;
        double root1, root2;
        System.out.println("Enter the coeffiecients");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        root1 = ((-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a);
        root2 = ((-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a);
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
        sc.close();
    }
}
