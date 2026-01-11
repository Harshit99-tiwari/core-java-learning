package Basics;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("enter the value of x and y:");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.print("sum of " + x + " and " + y + " is " + (x + y));

        int breadth, height, depth;
        System.out.print("enter the breadth,height and depth of cube");
        breadth = sc.nextInt();
        height = sc.nextInt();
        depth = sc.nextInt();
        double volume = breadth * height * depth;
        double area = 6 * height * height;
        System.out.println("the volume of circle is:" + volume);
        System.out.print("the area of circle is:" + area);

        int radius, height2;
        System.out.print("enter the height and radius of cylinder: ");
        height2 = sc.nextInt();
        radius = sc.nextInt();
        double area2 = (2 * 3.14 * radius * height2) + 2 * 3.14 * radius * radius;
        System.out.print("Area of " + "cylinder" + " is " + (area2));

        int x1, y1, p, q;
        System.out.print("enter the four coordinates");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        p = sc.nextInt();
        q = sc.nextInt();

        double distance = Math.sqrt((x1 * x1 + p * p - 2 * x1 * p) + (y1 * y1 + q * q - 2 * y1 * q));
        System.out.println("the distance between coordinates is" + (distance));

        double res = Math.pow(x1 - p, 2) + Math.pow(y1 - q, 2);
        res = Math.pow(res, 0.5);
        System.out.println(res);
        sc.close();
    }

}
