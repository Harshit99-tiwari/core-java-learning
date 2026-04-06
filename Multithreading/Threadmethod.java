package Multithreading;

class Myrun implements Runnable
{
    public void run()
    {
    int i =0;
    while(i<999){
        System.out.println(i);
        i++;
    }
    }
}

public class Threadmethod {
    public static void main(String[] args) {
         Thread t = new Thread(new Myrun(),"My name");
        t.start();
    }
}
