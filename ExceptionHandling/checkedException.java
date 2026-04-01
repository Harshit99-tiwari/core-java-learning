package ExceptionHandling;

import java.io.*;

public class checkedException {
    static void fun1() {
        try{
        FileInputStream f1 = new FileInputStream("My.txt");
        f1.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }
     
    public static void main(String[] args) {
      fun1();
      
    }

}

