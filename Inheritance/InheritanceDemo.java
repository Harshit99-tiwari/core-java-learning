package Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Cylinder c2 = new Cylinder();
        System.out.println(c1.area());
        System.out.println(c2.volume());
        System.out.println(c2.area());
    }
}

class Circle {
    public double radius;

    public Circle() {
        radius = 2.0;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        height = 1.0;
    }

    public double volume() {
        return 3.14 * radius * radius * height;
    }
}
