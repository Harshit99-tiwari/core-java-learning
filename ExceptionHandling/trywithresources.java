package ExceptionHandling;
import java.util.*;
import java.io.*;

public class trywithresources {
    static void Divide() throws Exception {
        try(FileInputStream   fi= new FileInputStream("C:\\Users\\ASUS\\Desktop\\Test.txt"); Scanner sc = new Scanner(fi))
         {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / c);
            System.out.println(b);
        } 
    }
    public static void main(String[] args) {
         try {
            Divide();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
