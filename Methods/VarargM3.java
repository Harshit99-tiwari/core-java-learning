package Methods;

public class VarargM3 {
    static double discount(double... p) {
        double sum = 0;
        double discount = 0;
        for (int i = 0; i < p.length; i++) {
            sum = sum + p[i];
        }
        if (sum < 100) {
            discount = sum - 0;
        } else if (sum > 100 && sum < 500) {
            discount = sum - (sum * 0.10);
        } else if (sum > 500 && sum < 1000) {
            discount = sum - (sum * 0.20);
        }
        return discount;
    }
     public static void main(String[] args) {
        System.out.println(discount(1,2,3,4));
        System.out.println(discount(10,20,30,40,50));
        System.out.println(discount(100,200,300,50,50));
        
    }
}
