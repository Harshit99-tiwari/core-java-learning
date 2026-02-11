package Methods;

public class Methodoverloading1 {
    int NumberReverse(int n) {
        int rev = 0;
        while (n > 0) {
            int ld = n % 10;
            n = n / 10;
            rev = (rev * 10) + ld;
        }
        return rev;
    }

    int[] ElementReverse(int A[]) {
        int B[] = new int[A.length];
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];
        }
        return B;
    }

    int[] ArrReverse(int A[]) {
        for (int i = A.length - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
        return A;
    }

    public static void main(String[] args) {
        int A[] = { 3, 4, 5, 6, 7 };
        Methodoverloading1 m = new Methodoverloading1();
        System.out.println(m.NumberReverse(346));
        m.ArrReverse(A);
        int q[] = m.ElementReverse(A);
        System.out.println();
        for (int y : q) {
            System.out.print(y + " ");
        }
    }
}
