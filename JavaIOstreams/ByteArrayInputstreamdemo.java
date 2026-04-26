package JavaIOstreams;

import java.io.ByteArrayInputStream;

public class ByteArrayInputstreamdemo {
    public static void main(String[] args) throws Exception
     {
         byte b[] = {'a','b','c','d','e','f','g','h'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

       String str=new String( bis.readAllBytes());
       System.out.println(str);
       System.out.println(bis.markSupported());

        /*int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }*/
        bis.close();
    }
}
