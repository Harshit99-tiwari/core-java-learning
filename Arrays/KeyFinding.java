package Arrays;

public class KeyFinding {
    public static void main(String[] args) {
        int A[] = { 4, 5, 3, 2, 6 };
        int key = 2;
        for (int i = 0; i < A.length; i++) {
            if (key == A[i]) {
                System.out.println("key found at index: " + i);
                System.exit(0);
            }

        }
        System.out.println("key not found");
    }
}
