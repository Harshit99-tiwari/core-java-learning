package Conditional_Statements;

import java.util.Scanner;

public class IfandElse2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int a,b,c;
        System.out.print("Enter the value of a,b,c: " );
        a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();


        if(a>b && a>c){
            System.out.println("a"+"is"+"greater"+"among these three numbers");
        }
        else if(b>c){
            System.out.println(b+" is "+"greater "+" among these three numbers");
        } 
        else{
         System.out.println(c+" is "+"greater among these three numbers");
        }

    sc.close();
    }
}
