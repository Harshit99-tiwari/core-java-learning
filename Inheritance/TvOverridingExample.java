package Inheritance;

public class TvOverridingExample {
    public static void main(String[] args) {
        TV t = new TV();
        t.SwitchON();

        Smarttv tt = new Smarttv();
        tt.SwitchON();
        tt.browse();
        tt.changeChannel();

        TV t1 = new Smarttv();
        t1.SwitchON();
    }
}

class TV {
    public void SwitchON() {
        System.out.println("TV IS ON");
    }

    public void changeChannel() {
        System.out.println("TV CHANNEL IS CHANGE");
    }
}

class Smarttv extends TV {
    @Override
    public void SwitchON() {
        System.out.println("smarttv is on");
    }

    @Override
    public void changeChannel() {
        System.out.println("smarttv channel is change");
    }

    public void browse() {
        System.out.println("smarttv is browsing");
    }
}
