package Arrays;

public class Rightshifting {
    public static void main(String[] args) {
        //rotating an array::right shifting 
      int A[]={5,9,6,12,34,7,3,5,2,4};
      int temp=A[0];
      for(int i =1;i<A.length;i++){
        A[i-1]=A[i];
      }
      A[A.length-1]=temp;
      for(int x:A){
        System.out.print(x+" ");
      }
    }
}
