package Basics;

import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // arae of triangle
          
          int a,b,c;
          float s;
         double area;
          System.out.println("Enter the three sides of triangle");
          a= sc.nextInt();
          b=sc.nextInt();
          c=sc.nextInt();
          s=(a+b+c)/2f;
          area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
          System.out.println("Area is "+area);
          sc.close();
    }
}
