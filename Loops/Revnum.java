package Loops;

import java.util.Scanner;

public class Revnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n= sc.nextInt();
        int r;
        int rev = 0;

        while(n>0)
        {
            r= n % 10 ;
            rev = rev * 10 + r;
            n= n/10 ;
        }
        System.out.println("The reverse of given number is "+rev );
        sc.close();
    }
    
}
