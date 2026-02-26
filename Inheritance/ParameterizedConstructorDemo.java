package Inheritance;

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Cuboid c = new Cuboid();
        System.out.println(c.volume());

        Cuboid c1 = new Cuboid(2);
        System.out.println(c1.volume());

        Cuboid c2 = new Cuboid(2, 4, 5);
        System.out.println(c2.volume());
    }
}

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = breadth = 1;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle {
    int height;

    Cuboid() {
        height = 1;
    }

    Cuboid(int h) {
        height = h;
    }

    Cuboid(int h, int l, int b) {
        super(l, b);
        height = h;
    }

    int volume() {
        return length * breadth * height;
    }
}
