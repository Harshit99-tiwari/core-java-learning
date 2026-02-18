package OOP;

public class Rec {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        System.out.println("Area of Reactangle: "+r.area(4, 5));
        System.out.println("Perimeter of Rectangle: "+r.perimeter(2, 3));
    }
}

class rectangle {
    int l;
    int b;

    int area(int l, int b) {

        return l * b;
    }

    int perimeter(int l, int b) {
        return 2 * (l + b);

    }
}
