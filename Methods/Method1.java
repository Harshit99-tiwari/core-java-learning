package Methods;

public class Method1 {
    static int max(int x, int y) {
        return x > y ? x : y;
    }

    static float max(float x, float y) {
        return x > y ? x : y;
    }

    static int max(int x, int y, int z) {
        return x > y && x > z ? x : (y > z ? y : z);
    }

    static double max(double a, double b) {
        return a > b ? a : b;
    }

    static byte max(byte a, byte b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(max(5, 6));
        System.out.println(max(5, 6, 7));
        System.out.println(max(5.6f, 2.2f));
        System.out.println(max(5.567d, 5.567893));
        byte a = 9, b = 2;
        System.out.println(max(a, b));
    }
}
