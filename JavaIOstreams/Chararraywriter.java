package JavaIOstreams;

import java.io.*;

public class Chararraywriter {
    public static void main(String[] args) throws Exception {

        CharArrayWriter cw = new CharArrayWriter();
        cw.write('a');
        cw.write('b');
        cw.write('c');
        cw.write('d');
        cw.write('y');
        FileWriter fw = new FileWriter("C:/Users/ASUS/Desktop/Destination.txt");
        cw.writeTo(fw);
       /* char c[]=cw.toCharArray();
        for(char x:c)
            System.out.print(x);
*/
       // cw.writeTo(new FileWriter("C:/Users/ASUS/Desktop/Destination.txt"));
fw.close();
      
    }
}
