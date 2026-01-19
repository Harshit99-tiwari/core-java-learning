package Loops;

import java.util.Scanner;

public class PrimeNumcheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         //prime number checking
         System.out.print("Enter a number: ");
        int num=sc.nextInt();
        boolean p = true;
        for(int i =2;i<num;i++){
            if(num%i==0){
                p =false;
                break;
            }
        }
        if(p==true){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }
        sc.close();
    }
    
}
