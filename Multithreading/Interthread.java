package Multithreading;

class Myydata {
    int value;
    boolean flag = true;

    synchronized public void set(int v) 
    {
        while (flag != true)
            try {wait();}catch(Exception e){}
        value = v;
        flag = false;
        notify();

    }
    synchronized public int get() 
    {
      int x = 0;
      while(flag!=false)
        try {wait();}catch(Exception e){}
    x= value;
    flag = true;
    notify();
    return x;
    }
}
class Producer extends Thread
{
   Myydata d;
   public Producer(Myydata dat)
   {
     d = dat;
   }
   public void run()
   {
     int i =1;
    while(true)
    {
      d.set(i);
        System.out.println("Producer: "+i);
        i++;
    }
   }
   
}
class Consumer extends Thread
{
  Myydata d;
  public Consumer(Myydata dat)
  {
    d=dat;
  }
  public void run()
  {
    int value;
    while(true)
    {  
     value = d.get();
     System.out.println("Consumer: "+value);

    }
  }
}

public class Interthread {
    public static void main(String[] args) {
    Myydata data = new Myydata();
    Consumer c = new Consumer(data);
    Producer p =new Producer(data);
    c.start();
    p.start();
    }
}
