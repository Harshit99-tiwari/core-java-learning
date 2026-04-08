package Multithreading;

class Mythread extends Thread {
    public Mythread(String name) {
        super(name);
    }

    public void run() {
        int count = 1;
        while (count < 10000) {
            System.out.println(count++);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Threadm3demo {
    public static void main(String[] args) {
        Mythread t = new Mythread("My thread 1");
        t.start();
        t.interrupt();
    }
}
