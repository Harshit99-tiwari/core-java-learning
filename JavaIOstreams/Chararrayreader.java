package JavaIOstreams;

import java.io.CharArrayReader;

public class Chararrayreader {
    public static void main(String[] args) throws Exception
     {
        char c[] = {'a','b','c','d','e','f','g','h'};
        CharArrayReader cr = new CharArrayReader(c);
        int x;
        while((x=cr.read())!=-1)
        {
            System.out.println((char)x);
        }
cr.close();

    }
}
