package Inheritance;

public class ThisVsSuperDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 10);
        r1.display();
        Rectangle r2 = new Rectangle(14, 100);
        r2.display();

        Cuboid c = new Cuboid(1, 10, 10);
        c.display();
    }
}

class Rectangle {
    int length;
    int breadth;
    int x = 10;

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }
}

class Cuboid extends Rectangle {
    int height;
    int x = 20;

    Cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}
