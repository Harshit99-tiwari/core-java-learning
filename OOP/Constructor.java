package OOP;

public class Constructor {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 1);
        Rectangle r2 = new Rectangle(2, 3);
        System.out.println(r1.area());
        System.out.println(r2.area());
    }
}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 2; // default constructor
        breadth = 5;
    }

    public Rectangle(int l, int b) {
        length = l; // parameterized constructor
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }
}
