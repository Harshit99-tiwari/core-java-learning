package Methods;

public class VarargM1 {
    int sum(int...A){
        int sum = 0;
        for(int i =0 ;i<A.length;i++){
            sum = sum + A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        VarargM1 m = new VarargM1();
        System.out.println(m.sum(1,3,2,4,5,6));
    }
}
