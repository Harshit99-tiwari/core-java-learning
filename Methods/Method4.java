package Methods;

public class Method4 {

    int gcd(int m ,int n){
        for(int i =1;i<m;i++){
            if(m>n){
                m = m-n;
            }else{
                n = n-m;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Method4 m = new Method4();
        System.out.println(m.gcd(56, 35));
    }
}
