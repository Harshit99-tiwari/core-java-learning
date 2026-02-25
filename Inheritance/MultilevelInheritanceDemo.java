package Inheritance;

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Grandchild c = new Grandchild();
        c.show();
    }
}

class Parent {
    public Parent() {
        System.out.println("parent constructor");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("child constructor");
    }
}

class Grandchild extends Child {
    public Grandchild() {
        System.out.println("grandchild constructor");
    }

    void show() {
        System.out.println("calling constructors");
    }
}
