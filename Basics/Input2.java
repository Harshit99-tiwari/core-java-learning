package Basics;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius;
        System.out.println("radius of circle:");
        radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println(area);

        float radius1;
        System.out.println("radius of circle:");
        radius1 = sc.nextFloat();
        double area2 = 3.14 * radius1 * radius1;
        System.out.println(area2);

        byte rad;
        System.out.println("radius of circle");
        rad = sc.nextByte();
        double area3 = 3.14 * rad * rad;
        System.out.println(area3);

        long r;
        System.out.println("radius of circle");
        r = sc.nextLong();
        double area4 = (3.14 * r* r);
        System.out.println(area4);

        short r1;
        System.out.println("radius of circle");
        r1 = sc.nextShort();
        double area5 = 3.14 * r1 * r1;
        System.out.println(area5);

        sc.close();
    }
}
