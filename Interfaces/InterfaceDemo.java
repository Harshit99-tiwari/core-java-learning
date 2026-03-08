package Interfaces;

interface Test {
    void meth1();

    void meth2();
}

class My implements Test {
    @Override // optional to write this @override
    public void meth1() {
        System.out.println("method 1 of My");
    }

    @Override // optional to write this @override
    public void meth2() {
        System.out.println("method 2 of My");
    }

    public void meth3() {
        System.out.println("meth3 of my");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        My m = new My();
        m.meth1();
        m.meth2();
        m.meth3();

        Test t = new My();
        t.meth1();
        t.meth2();
    }
}
