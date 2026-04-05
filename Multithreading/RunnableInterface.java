package Multithreading;

class My implements Runnable
{
   public void run()
   {
    int i =1;
    while(i<=5)
    {
        System.out.println("hello");
        i++;
    }
   }
}

public class RunnableInterface {
    public static void main(String[] args) {
         My m = new My();
        Thread t = new Thread(m);
        t.start();
        int i =1;
        while(i<=5)
        {
            System.out.println("world");
            i++;
        }
    }
}
