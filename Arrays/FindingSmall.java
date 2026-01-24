package Arrays;

public class FindingSmall {
    public static void main(String[] args) {
        int A[] = { 3, 45, 6, 1, 32, 8 };
        int sml = A[0];
        for (int i = 0; i < A.length; i++) {
            if (sml > A[i]) {
                sml = A[i];
            }
        }
        System.out.println("smallest belement " + sml);
    }
}
