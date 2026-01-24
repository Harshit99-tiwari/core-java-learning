package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int A[] = { 22, 3, 4, 5, 6 };
        int max1 = A[0];
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } else if (A[i] > max2 && A[i] < max1) {
                max2 = A[i];
            }
        }
        System.out.println("second largest element: " + max2);
    }
}
