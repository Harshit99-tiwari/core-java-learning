package Basics;

public class diffdatatypesum {
    public static void main(String[] args) {
        int i = 3;
        byte b = 4; // these are added with these data types
        short s = 5;
        long l = 45l;
        float f = 12.5f;
        double d = 17.5d;
        char c = 34;

        System.out.println(i + b);
        System.out.println(l + f);
        System.out.println(d + c);
        System.out.println(b + s);
        System.out.println(b + i);
        System.out.println(i + f);
        System.out.println(c + s);
        System.out.println(f + d);
        System.out.println(l + d);
        System.out.println(i + c);
    }
}
