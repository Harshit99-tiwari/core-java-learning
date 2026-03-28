package ExceptionalHandling;

public class NestedTryandCatch {
    public static void main(String[] args) {
         int A[] = { 10, 0, 4, 5 };
        try {
            int c = A[0] / A[1];
            System.out.println(c);
            try {
                System.out.println(A[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("invalid index");
            }
        } catch (ArithmeticException e) {
            System.out.println("denominator should not be zero");
        }
    }
}
