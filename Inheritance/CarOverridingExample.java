package Inheritance;

public class CarOverridingExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.Start();
        c.Accelerate();
        c.gearchange();

        Luxurycar lc = new Luxurycar();
        lc.Start();
        lc.Accelerate();
        lc.Openroof();

        Car c1 = new Luxurycar();
        c1.Accelerate();
        c1.Start();
    }
}

class Car {
    public void Start() {
        System.out.println("car is started");
    }

    public void Accelerate() {
        System.out.println("car is accelerated");
    }

    public void gearchange() {
        System.out.println("car gear is changed");
    }
}

class Luxurycar extends Car {
    @Override // optional to write
    public void Start() {
        System.out.println("luxurycar is started");
    }

    public void Openroof() {
        System.out.println("luxury car roof is opened");
    }
}
