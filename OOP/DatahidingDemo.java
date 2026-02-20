package OOP;

public class DatahidingDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setl(5);
        r.setb(4);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}

class Rectangle {

    private int l;
    private int b;

    public int getl() {
        return l;
    }

    public void setl(int l1) {
        l = l1;
    }

    public int getb() {
        return b;
    }

    public void setb(int b1) {
        b = b1;
    }

    public int area() {
        return l * b;
    }

    public int perimeter() {
        return 2 * (l + b);
    }
}
