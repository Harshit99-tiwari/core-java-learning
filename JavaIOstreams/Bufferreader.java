package JavaIOstreams;

import java.io.*;

public class Bufferreader {
    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader("C:/Users/ASUS/Desktop/Tsxt.txt");
        BufferedReader bis = new BufferedReader(fis);
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.mark(10);
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.reset();
         System.out.println((char) bis.read());
        System.out.println((char) bis.read());

        System.out.println("String"+bis.readLine());
bis.close();
    }
}

