package Arrays;

public class SumofElement {
    public static void main(String[] args) {
         int A[]={1,4,2,2,2,2};
        int sum=0;
        for(int i =0;i<A.length;i++){
            sum = sum + A[i];
        }
        System.out.println("sum is: "+sum);
    }
}
