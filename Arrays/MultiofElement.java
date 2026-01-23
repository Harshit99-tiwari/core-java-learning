package Arrays;

public class MultiofElement {
    public static void main(String[] args) {
        int A[]={1,2,3,2,4,1};
        int mul=1;
        for(int i =0;i<A.length;i++){
            mul = mul*A[i];
        }
        System.out.println("multiplication is: "+mul);
    }
}
