package Multithreading;

class Mythreads extends Thread
{
    public void run()
    {
       int count = 1;
       while(count<10000)
        {
            System.out.println(count++);
        } 
    }
}

public class DaemonThread {
    public static void main(String[] args) throws Exception 
    {
        Mythreads t = new Mythreads();
        t.setDaemon(true);
        t.start();
        try{Thread.sleep(100);}catch(Exception e){}
    }
}