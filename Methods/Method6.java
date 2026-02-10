package Methods;

public class Method6 {
    int max(int A[]){
        int max = A[0];
        for(int i =0;i<A.length;i++){
            if(max<A[i]){
                max = A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int A[]= {12,3434,12,3,3,45,5678};
        Method6 m  = new Method6();
        System.out.println(m.max(A));

    }
}
