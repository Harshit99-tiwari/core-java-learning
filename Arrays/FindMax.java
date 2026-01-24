package Arrays;

public class FindMax {
    public static void main(String[] args) {
        int A[] = { 255, 56, 4, 34, 78, 23, 999 };
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }
        System.out.println(max);
    }
}
