package Interfaces;

public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println(Test.X);
        Test.meth3();
        My m = new My();
        m.meth5();
        m.meth3();
    }
}

interface Test {
    final static int X = 10;

    public abstract void meth1();

    public abstract void meth2();

    public static void meth3() {
        System.out.println("meth3 of Test");
    }

    default void meth5() {
        System.out.println("def method");
    }

    private void m6() {
        System.out.println("m6 of test");
    }

    default void m7() {
        m6();
    }
}

interface Test2 extends Test {
    void meth4();
}

class My implements Test2 {
    public void meth4() {
        System.out.println(" my meth4");
    }

    public void meth1() {
        System.out.println("my meth1");
    }

    public void meth2() {
        System.out.println("my meth2");
    }

    public void meth3() {
        System.out.println("my meth3");
    }
}
