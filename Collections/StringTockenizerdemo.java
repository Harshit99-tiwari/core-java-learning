package Collections;

import java.io.FileInputStream;
import java.util.ArrayList;

import java.util.StringTokenizer;

public class StringTockenizerdemo {
    public static void main(String[] args)throws Exception{
      /* 
      String data = "Name=Harshit;address=Bhopal;country=India;dept=CSE";
        StringTokenizer stk =  new StringTokenizer(data,"=;");
        String s;
        while(stk.hasMoreTokens())
        {
            s = stk.nextToken();
            System.out.println(s);
        }
*/
      /*   FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\token.txt");
        byte b[] =  new byte[fis.available()];
        fis.read(b);
        String data = new String(b);
       
        StringTokenizer stk =  new StringTokenizer(data,"=");
        String s;
        while(stk.hasMoreTokens())
        {
            s = stk.nextToken();
            System.out.println(s);
        }*/
       FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Data.txt");
        byte b[] =  new byte[fis.available()];
        fis.read(b);
        String data = new String(b);
       
        StringTokenizer stk =  new StringTokenizer(data,",");
        String s;
        ArrayList<Integer> al = new ArrayList<>();
        while(stk.hasMoreTokens())
        {
            s = stk.nextToken();
            al.add(Integer.valueOf(s));
        }
        System.out.println(al);
        fis.close();
    }
}
