package Arrays;

public class CopyElement {
    public static void main(String[] args) {
         //copy element in new array
        int A[]={1,2,3,4,5};
        int B[]=new int[A.length];
        for(int i =0;i<A.length;i++){
            B[i]=A[i];
        }
        for(int x:B){
            System.out.print(x+" ");
        }
    }
}
