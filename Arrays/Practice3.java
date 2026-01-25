package Arrays;

public class Practice3 {
    public static void main(String[] args) {
        int A[] = { 2, 4, 6, 8, 10 };
        boolean isSorted = true;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] > A[i]) {
                isSorted = false;
            }

        }
        System.out.println(isSorted);
    }
}
