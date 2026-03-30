package ExceptionHandling;

public class ThrowvsThrows {
    static int marks(int m) throws NegetiveDimensionException {
        if (m < 0) {
            throw new NegetiveDimensionException();
        }

        int mar = m;
        return mar;
    }

    static void stu() {
        try {
            int m = marks(-9);
            System.out.println(m);
        } catch (NegetiveDimensionException e) {
            System.out.println(e);
        }
    }

    static int area(int l, int b) throws Exception {
        if (l < 0 || b < 0) {
            throw new Exception("l and b must be positive ");
        }
        int a = l * b;
        return a;
    }

    static void fun1() throws Exception {

        int a = area(5, -6);
        System.out.println(a);

    }

    public static void main(String[] args) {
        try {
            fun1();
        } catch (Exception e) {
            System.out.println(e);
        }
        stu();
    }
}

class NegetiveDimensionException extends Exception {
    public String toString() {
        return "mark must be positive";
    }
}
