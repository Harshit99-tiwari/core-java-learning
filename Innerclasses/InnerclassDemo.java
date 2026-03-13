package Innerclasses;

public class InnerclassDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}

class Outer {
    void display() {
        class Inner { // local inner class
            void InnerDisplay() {
                System.out.println("hello");
            }
        }
        Inner i = new Inner();
        i.InnerDisplay();
    }
}
