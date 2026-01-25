package Arrays;

public class DeleteElement {
    public static void main(String[] args) {
         //deletion of an element
        int A[]=new int[10];
        A[0]=4;
        A[1]=5;
        A[2]=2;
        A[3]=9;
        A[4]=8;
        A[5]=1;
        int n=6;
        int index=1;
        for(int i =index;i<n-1;i++){
            A[i]=A[i+1];
        }
        n--;
       for(int i =0;i<n;i++){
        System.out.print(A[i]+" ");
       }
    }
}
