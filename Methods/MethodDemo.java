package Methods;

public class MethodDemo {
    static int max(int m ,int n){
        return m>n?m:n ;
    }
    public static void main(String[] args) {
        int a = 4,b=5,c;
        c = max(a, b);
        System.out.println(c);
    }
}
