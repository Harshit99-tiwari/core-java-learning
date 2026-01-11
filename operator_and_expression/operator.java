package operator_and_expression;

public class operator {

    public static void main(String[] args) {
        // And operator
        int x = 10, y = 6, z; // 00001010 & 00000110= 00000010
        z = x & y; // only one one become one
        System.out.println(z);

        // or operator
        int a = 10, b = 6, c; // 00001010 only zero zero become zero
        c = a | b; // 00000110
        System.out.println(c);

        // not operator
        int v = 6, m;
        m = ~v;
        System.out.println(m);

        int p = 10, q = 6, r; // 00001010 only zero zero and one one become zero
        r = p ^ q; // 00000110
        System.out.println(r); // 00001100

        int a1 = 10, b1;
        b1 = a1 << 1; // (left shift) it gives double of 10 for 1,for 2 it give 40 and so on
        b1 = a1 >> 1; // (right shift)it gives half of ten same as left shift pattern
        b1 = a1 >> 1;
        System.out.println(b1);

        byte b2 = 10;
        short s = 10;

        b2 = (byte) s; // narrowing: will data loss
        int i = b2;
        System.out.println(i);

    }

}
