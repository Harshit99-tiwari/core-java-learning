package Multithreading;

class Mythreadd extends Thread {
    public Mythreadd(String name) {
        super(name);
        setPriority(Thread.NORM_PRIORITY + 5);
    }
}

public class Threadm2demo {
    public static void main(String[] args) {
        Mythreadd t = new Mythreadd("My thread 1");
        System.out.println("ID: " + t.getId());
        System.out.println("Name: " + t.getName());
        t.start();
        System.out.println("State: " + t.getState());
        System.out.println("Alive: " + t.isAlive());
        System.out.println("Priority: " + t.getPriority());
    }
}
