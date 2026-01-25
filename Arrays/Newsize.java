package Arrays;

public class Newsize {
    public static void main(String[] args) {
         //increasing size of an array
      int A[]={1,2,3,4,5} ;
      System.out.println("old length of A "+A.length);
      int B[]=new int[2*A.length];
      for(int i =0;i<A.length;i++){
        B[i]=A[i];
      }
      A=B;
      B=null;
      for(int x:A){
        System.out.print(x+" ");
      }
      System.out.println();
      System.out.print("new length of A "+A.length);
    }
}
