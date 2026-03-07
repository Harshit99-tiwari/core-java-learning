package AbstractClasses;

abstract class Shape {
    abstract double perimeter();

    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    double perimeter() {
        return 2 * 3.14 * radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    double area() {
        return length * breadth;
    }
}

public class AbstractExample3 {
    public static void main(String[] args) {
        Shape s = new Circle(4);
        System.out.println(s.area());
        System.out.println(s.perimeter());

        s = new Rectangle(2, 3);
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
