package Methods;

public class VarargMethod {
    int max(int...A){
        if(A.length==0){
        return Integer.MIN_VALUE;
        }
        int max = A[0];
        for(int i =0;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        VarargMethod m = new VarargMethod();
        System.out.println(m.max(2,3,412,4323));
        System.out.println(m.max(23,34,1,98,67,45));
    }
}
