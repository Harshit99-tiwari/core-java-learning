package Loops;

public class Pattern {
    public static void main(String[] args) {
        /*
         * // PATTERN
         * 
         * *
         * * *
         * * * *
         * * * * *
         */

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            int colm = i;
            for (int j = 1; j <= colm; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
      

            //PATTERN 1
        /*
        * 
      * * 
    * * * 
  * * * * 
* * * * *
 */
          int rows1=5;
          for(int i =1;i<=rows1;i++){
            
             int space =5-i;
              for(int k =1;k<=space;k++){
                 
                  System.out.print("  ");
            }
             int colm = i;
          for( int j =1;j <=colm;j++){
          System.out.print("* ");
          }
          System.out.println();
          }
          //PATTERN 2
 /*
* * * * * 
* * * * 
* * * 
* * 
*
*/
          int rows2 =5;
          for(int i = 0;i<=rows2;i++){
          int colm = rows-i;
          for(int j =1;j<=colm;j++){
          System.out.print("* ");
          }
          System.out.println();
          }   
 /*
         * * * * *
           * * * * 
             * * *
               * *
                 *
         */
         int rows4 =5;
          for(int i = 0;i<rows4;i++){
            int space = i;
            for(int k =1;k<=space;k++){
                System.out.print("  ");
            }
          int colm = rows-i;
          for(int j =1;j<=colm;j++){
          System.out.print("* ");
          }
          System.out.println();
          }
    }
}
