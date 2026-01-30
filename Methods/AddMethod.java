package Methods;

import java.util.Scanner;

public class AddMethod {
    static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int res = add(5,7);
        System.out.println(res);
        
      
       sc.close(); 
    }
}
