package Conditional_Statements;

import java.util.Scanner;

public class IfandElse6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE AGE OF ANY PERSON:");
        int age = sc.nextInt();
        if (age >= 14 && age <= 45) {
            System.out.println("YOUNG PERSON");
        } else if (age < 14 || age > 45) {
            System.out.println("PERSON IS NOT YOUNG");
        }

        sc.close();
    }
}
