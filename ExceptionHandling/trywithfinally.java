package ExceptionHandling;

import java.util.*;
import java.io.*;

public class trywithfinally {
    static FileInputStream f1;
    static Scanner sc;

    static void Divide() throws Exception {
        f1 = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Test.txt");
        try {
            sc = new Scanner(f1);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / c);
            System.out.println(b);
        } finally {
            f1.close();
            sc.close();
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            Divide();
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
}

