package JavaIOstreams;

import java.io.*;

public class Bufferstream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/ASUS/Desktop/Tsxt.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.mark(10);
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.reset();
         System.out.println((char) bis.read());
        System.out.println((char) bis.read());
       

        // System.out.println("File "+fis.markSupported());
        // System.out.println("Buffer "+bis.markSupported());
        /*
         * int x;
         * while((x=bis.read())!=-1)
         * System.out.print((char)x);
         */

        bis.close();
    }
}
