package Arrays;

public class ReverseTraversing {
    public static void main(String[] args) {
        int A[]={2,3,4,5,6};
        for(int i =A.length-1;i>=0;i--){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int s=0;
        int e=A.length-1;
        while(s<e){
            int temp=A[s];
            A[s]=A[e];
            A[e]=temp;
            s++;
            e--;
        }
        for(int x:A){
            System.out.print(x+" ");
        } 
    }
}
