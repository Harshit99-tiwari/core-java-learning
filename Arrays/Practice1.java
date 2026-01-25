package Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int A[] = {4,5,7,8,9,12};
        int evencount=0;
        int oddcount =0;
        for(int i =0;i<A.length;i++){
            if(A[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
            
            
        }
        System.out.print("NO OF EVEN NUMBER: "+evencount+"\n");
            System.out.print("NO OF ODD NUMBER: "+oddcount);
    }
}
