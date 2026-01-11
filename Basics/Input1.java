package Basics;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);    
int x,y,z;
System.out.print("enter the value of three number :");
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
 float avgresult=(x+y+z)/3f;
 System.out.println("THE AVGRESULT IS: "+avgresult);

int p;
System.out.println("enter the value of p: ");
 p=sc.nextInt();
 double q;
 System.out.println("entrer the value of y: ");
 q =  sc.nextDouble();
System.out.println("the sum of " +p+ " and  " +q+ " is "+(double)(p+q));
sc.close();
    }
}
