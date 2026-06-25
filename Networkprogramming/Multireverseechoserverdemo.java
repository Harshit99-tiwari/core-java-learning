package Networkprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class Clients{
    public static void main(String[] args) throws Exception
    {
        Socket skt=new Socket("192.168.1.2",2000);
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps=new PrintStream(skt.getOutputStream());

        String msg;
       // StringBuilder sb;

        do{
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From server"+msg);

        } while(!msg.equals("dne"));
        skt.close();
    }
}

public class Multireverseechoserverdemo extends Thread
{
    Socket skt;
    public Multireverseechoserverdemo(Socket st)
    {
        skt=st;
    }
    public void run()
    {
        try{
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
      
    }
    catch(Exception e){}
    }
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        int count=1;
        Socket skt;
         Multireverseechoserverdemo mr;

        do{
         skt = ss.accept();
         System.out.println("client connected"+count++);
         mr=new Multireverseechoserverdemo(skt);
         mr.start();
         
        }while(true);
    
        
       
    }
   
}