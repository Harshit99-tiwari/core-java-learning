package AbstractClasses;

public class AbstractDemo {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.meth2();
    }
}

abstract class Super {
    void meth1() {
        System.out.println("super meth1");
    }

    abstract void meth2();
}

class Sub extends Super {
    void meth2() {
        System.out.println("sub meth2");
    }
}