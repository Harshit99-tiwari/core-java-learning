package Methods;

import java.util.Scanner;

public class Method5 {
    static boolean Isprime(int n){
        for(int i =2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();
        System.out.println(Isprime(a));
        sc.close();
    }
}
