package Multithreading;

class Mythreadds extends Thread {
    public void run() {
        int count = 1;
        while (count < 1000) {
            System.out.println(count++ +"my thread");
        }
    }
}

public class yieldThread {
    public static void main(String[] args) {
        Mythreadds t = new Mythreadds();
        t.start();
         int count = 1;
        while (count < 1000) {
            System.out.println(count++ +"main thread");
            Thread.yield();
        }
    }
}