package JavaIOstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Studentchallenge {
    public static void main(String[] args) {
         try (FileInputStream fis1 = new FileInputStream("C:/Users/ASUS/Desktop/Source1.txt");) {
           try (FileInputStream fis2 = new FileInputStream("C:/Users/ASUS/Desktop/Source1.txt");) {
            try (FileOutputStream fos = new FileOutputStream("C:/Users/ASUS/Desktop/Destination.txt");){
            SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
               
            int b;
             while((b=sis.read())!=-1)
             {
               fos.write(b);
             }
             fis1.close();
             fis2.close();
             fos.close();
             sis.close();
        }
        } 
    }
    catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
       
    }
}
