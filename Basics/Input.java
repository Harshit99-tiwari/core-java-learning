package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name: "+name);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Your age: "+age);

        sc.close();
    }
}
