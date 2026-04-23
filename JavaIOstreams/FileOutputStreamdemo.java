package JavaIOstreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamdemo {
    public static void main(String[] args) {
         try( FileOutputStream fos = new FileOutputStream("C:/Users/ASUS/Desktop/Test.txt");){
            String str = "LEARN --JAVA PROGRAMMING";

            byte b[]=str.getBytes();
            fos.write(b);
            fos.close();
           }
        
        

       /* try {
            FileOutputStream fos = new FileOutputStream("C:/Users/ASUS/Desktop/Test.txt");
            String str = "LEARN JAVA PROGRAMMING";
            byte b[]=str.getBytes();
            fos.write(b);
          //  fos.write(b, 6, str.length()-6); //write from 6th index
           // for(byte x:b)     //write
             //   fos.write(x);
          //  fos.write(str.getBytes());//write
            fos.close();
            */
         catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
