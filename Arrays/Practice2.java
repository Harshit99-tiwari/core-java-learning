package Arrays;

public class Practice2 {
    public static void main(String[] args) {
         int A[]={1,2,3,5,4,3,2,1};
        int low = 0;
        int high =A.length-1;
        while(low<high){
            int mid =(low+high)/2;
            if(A[mid]<A[mid+1]){
                low =mid+1;
            }else{
                high =mid;
            }
        }
        System.out.println("peak index: "+low);
    }
}
