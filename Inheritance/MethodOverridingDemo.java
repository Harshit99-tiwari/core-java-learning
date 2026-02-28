package Inheritance;

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Super su = new sub();
        su.display();
        Super suu = new Super();
        suu.display();
        sub s = new sub();
        s.display();
    }
}

class Super {
    public void display() {
        System.out.println("HELLO");
    }
}

class sub extends Super {
    @Override
    public void display() {
        System.out.println("hello world");
    }
}