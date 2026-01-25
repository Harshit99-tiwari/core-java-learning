package Arrays;

public class InsertElement {
    public static void main(String[] args) {
           //inserting an element
        int A[]=new int[10];
        A[0]=4;
        A[1]=5;
        A[2]=2;
        A[3]=9;
        A[4]=8;
        A[5]=1;
        int n=6;
        int x=20;
        int index=2;
        for(int i =n;i>index;i--){
            A[i]=A[i-1];        
        }
          A[index]=x;
n++;
for(int i =0;i<n;i++){
    System.out.print(A[i]+" ");
}
    }
}
