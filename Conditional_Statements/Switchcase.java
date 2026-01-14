package Conditional_Statements;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("===");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("enter the two number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the operator name in words");
        String operator = sc.nextLine();

        switch (operator) {
            case "ADD":
                System.out.println("Sum is " + (x + y));
                break;
            case "SUB":
                System.out.println(x - y);
                break;
            case "MUL":
                System.out.println(x * y);
                break;
            case "DIV":
                System.out.println(x / y);
                break;

        }
sc.close();
    }
}
