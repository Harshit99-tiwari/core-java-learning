package Interfaces;

public class InterfaceExample2 {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.videocall();
        Phone p = s;
        p.call();
        ICamera i = s;
        i.click();
        Musicplayer m = s;
        m.play();
    }
}

class Phone {
    void call() {
        System.out.println("calling");
    }

    void sms() {
        System.out.println("msgging");
    }
}

interface ICamera {
    void click();

    void record();
}

interface Musicplayer {
    void play();

    void pause();
}

class Smartphone extends Phone implements ICamera, Musicplayer {
    void videocall() {
        System.out.println("video calling");
    }

    public void click() {
        System.out.println("photo captured");
    }

    public void record() {
        System.out.println("recording started");
    }

    public void play() {
        System.out.println("music playing");
    }

    public void pause() {
        System.out.println("music paused");
    }
}
