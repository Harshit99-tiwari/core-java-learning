package Arrays;

public class ReverseCopy {
    public static void main(String[] args) {
          //copying element in  reverse order
        int A[]={1,2,3,4,5};
        int B[]=new int[A.length];
       for(int i =A.length-1,j=0;i>=0;i--,j++){
        B[j]=A[i];
       }
        for(int x:B){
            System.out.print(x+" ");
        }
    }
}
