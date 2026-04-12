package Multithreading;

class Mydata
{
   synchronized public void display(String str)
    {
       for(int i =0;i<str.length();i++) 
       {
        System.out.print(str.charAt(i));
        try{Thread.sleep(100);}catch(Exception e){System.out.println(e);}
       
    }
}
}
class Mythread1 extends Thread
{
  Mydata d;
  public Mythread1(Mydata d)
  {
    this.d = d;
  }
  public void run()
  {
    d.display("Hello world");
  }
}
class Mythread2 extends Thread
{
  Mydata d;
  public Mythread2(Mydata d)
  {
    this.d = d;
  }
  public void run()
  {
    d.display(" Welcome all");
  }
}

public class Syncdemo {
    public static void main(String[] args) {
        Mydata data = new Mydata();

        Mythread1 t1 = new Mythread1(data);
        Mythread2 t2 = new Mythread2(data);

        t1.start();
        t2.start();
    }
}
