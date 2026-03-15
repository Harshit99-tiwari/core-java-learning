package Innerclasses;

public class InnerExample2 {
    public static void main(String[] args) {
        Dart d = new Dart();
        d.meth();
    }
}

abstract class Upper {
    abstract void Display();
}

class Dart {
    public void meth() {
        Upper u = new Upper() { // Anonymous class
            public void Display() {
                System.out.println("hi  harsh");
            }
        };
        u.Display();
    }
}
