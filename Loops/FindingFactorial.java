package Loops;

import java.util.Scanner;

public class FindingFactorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =sc.nextInt();
        int fact = 1;
        int i =1;
        while(i<=num){
            fact = fact * i ;
            i++;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
        sc.close();
    }
}
