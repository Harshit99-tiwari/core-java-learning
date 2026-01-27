package Conditional_Statements;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the age");
        int age = sc.nextInt();
        int ticket=1;
        if(age<12){
            ticket = 100;
        }else if(age>12 && age<60){
            ticket = 200;
        }else if(age>60){
            ticket = 120;
        }
        System.out.println(ticket);
        sc.close();
    }
}
