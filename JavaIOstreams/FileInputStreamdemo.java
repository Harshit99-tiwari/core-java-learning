package JavaIOstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamdemo {
    public static void main(String[] args) {
        
           try (FileInputStream fis = new FileInputStream("C:/Users/ASUS/Desktop/Test.txt");)
             // try (FileReader fis = new FileReader("C:/Users/ASUS/Desktop/Test.txt");)  //same work
            {
               
                int x;

                while((x=fis.read())!=-1)
                {
                    System.out.print((char)x);
                }

               /* do{
                    x=fis.read();
                    if(x!=-1)
                    System.out.print((char)x);
                }
                while(x!=-1);*/
                fis.close();
                /*  byte b[] = new byte[fis.available()];
                fis.read(b);
                String str = new String(b);
                System.out.println(str);
                */
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
