package Loops;

public class Triangle {
    public static void main(String[] args) {
               //TRIANGLE
         /*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
          */
         int rows=5;
          for(int i =1;i<=rows;i++){
            
             int space =5-i;
              for(int k =1;k<=space;k++){
                 
                  System.out.print(" ");
            }
             int colm=i;
          for( int j =1;j <=colm;j++){
          System.out.print("* ");
          }
          System.out.println();
          }
    }
}
