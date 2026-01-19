package Loops;

import java.util.Scanner;

public class checkPelindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int m = num;
        int sum = 0;
        while(num>0){
            int ld = num%10;
            num = num/10;
            sum = sum*10 + ld;
        }
        
        if(sum ==m){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        sc.close(); 
    }
}
