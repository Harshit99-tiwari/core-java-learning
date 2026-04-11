package Multithreading;

class Mythreadss extends Thread
{
    public void run()
    {
       int count = 1;
       while(count<1000)
        {
            System.out.println(count++);
        } 
    }
}

public class joinThread {
     public static void main(String[] args) throws Exception 
    {
        Mythreadss t = new Mythreadss();
        t.setDaemon(true);
        t.start();
       Thread mainThread = Thread.currentThread();
       mainThread.join();

       
    }
}

