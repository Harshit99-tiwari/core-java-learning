package Arrays;

public class Practice4 {
    public static void main(String[] args) {
        int A[] = { 121, 231, 32, 1511, 24, 64 };
        int Digitsumeven = 0;
        for (int i = 0; i < A.length; i++) {
            int sumofDigit = 0;
            while (A[i] > 0) {
                int ld = A[i] % 10;
                A[i] = A[i] / 10;
                sumofDigit += ld;

            }
            if (sumofDigit % 2 == 0) {
                Digitsumeven++;
            }
        }
        System.out.println("There are " + Digitsumeven + " elements whose sum of digit is even");
    }
}
