package Staticandfinal;

public class Finaldemo {
    public static void main(String[] args) {
        FIF g = new FIF();
        g.meth1();
        g.meth();
    }
}

class FIFTY {
    final int max = 1;

    final void meth() {
        System.out.println("final method");
    }
}

class FIF extends FIFTY {
    void meth1() {
        System.out.println("extended class method");
    }

}
