package Inheritance;

class Super {
    public void meth1() {
        System.out.println("super meth1 called");
    }

    public void meth2() {
        System.out.println("super meth2 called");
    }
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("sub meth2 called");
    }

    public void meth3() {
        System.out.println("sub meth3 called");
    }
}

public class DMD {
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
}
