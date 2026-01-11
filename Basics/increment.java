package Basics;

public class increment {
    public static void main(String[] args) {
        char x = 'A';
        x++;
        System.out.println(x);

        int xa = 5, y;
        y = ++xa;
        System.out.println(y);

        byte x1 = 4;
        x1++;
        System.out.println(x1);

        float x2 = 5.6f;
        x2++;
        System.out.println(x2);

        int x3 = 5, y1;
        y1 = x3++;
        System.out.println(y1 + " " + x3);

         int x4=5,y3;
         y3=++x4;
         System.out.println(y3);

        int x5 = 5, z;
        z = 2 * x5++ + 3 * ++x5;
        // 2*5 + 3*7
        System.out.println(z + " " + x5);
    }
}
