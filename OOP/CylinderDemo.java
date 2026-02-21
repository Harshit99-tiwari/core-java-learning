package OOP;

public class CylinderDemo {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(2, 1);
        System.out.println(c.area());
        System.out.println(c.volume());
    }
}

class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        setRadius(r);
        setHeight(h);

    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double area() {
        return 3.14 * radius * radius * height;
    }

    public double volume() {
        return 2 * 3.14 * radius * (radius + height);
    }

}
