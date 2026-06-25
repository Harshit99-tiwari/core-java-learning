package Networkprogramming;  //to run this file remove this package line
import java.net.*;
import java.io.*;

 class Client{
    public static void main(String[] args) throws Exception
    {
        Socket skt=new Socket("192.168.1.2",2000);
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps=new PrintStream(skt.getOutputStream());

        String msg;
      //  StringBuilder sb;

        do{
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From server"+msg);

        } while(!msg.equals("dne"));

        skt.close();
    }
}
public class ReverseEchoServerDemo {
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(2000);
        Socket skt=ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps=new PrintStream(skt.getOutputStream());

        String msg;
        StringBuilder sb;

        do{
            msg=br.readLine();

            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();

            ps.println(msg);

        } while(!msg.equals("dne"));
        skt.close();
        ss.close();
    }
}