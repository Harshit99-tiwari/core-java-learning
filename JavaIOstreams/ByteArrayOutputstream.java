package JavaIOstreams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputstream {
    public static void main(String[] args) throws Exception
    {
         ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
         bos.write('a');
         bos.write('b');
         bos.write('c');
         bos.write('d');

         bos.writeTo(new FileOutputStream("C:/Users/ASUS/Desktop/Destination.txt"));



       /*   byte b[]=bos.toByteArray();
         for(byte x:b)
            System.out.print((char)x);*/


        bos.close();
    }
}
