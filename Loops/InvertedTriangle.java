package Loops;

public class InvertedTriangle {
    public static void main(String[] args) {
        // inverted triangle
        /*
             * * * * * *
               * * * *
                * * *
                 * *
                  * 
         */
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            int count = 4;
            int space = count + i;
            for (int k = 0; k <= space; k++) {
                System.out.print(" ");

            }
            int colm = rows - i;
            for (int j = 1; j <= colm; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
