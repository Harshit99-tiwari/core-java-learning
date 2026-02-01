package Loops;

import java.util.Scanner;

public class GPseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter first term of the gp series: ");
           int a = sc.nextInt();
           System.out.print("Enter the common diff of series: ");
           int r = sc.nextInt();
           System.out.print("Enter the n term of series: ");
           int n = sc.nextInt();
           int term = a;
           
           for(int i =0; i<n; i++){
           System.out.print(term+",");
           term = term * r;
          }
          sc.close();
    }
}
