package OOP;

public class CarDemo {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        System.out.println(c.name);
        c.stop();
    }
}

class car {
    String name;
    String regno;
    String col;
    double fuelqty;

    car() {
        this.name = "BMW";
        this.regno = "BR29PQ43";
        this.col = "Black";
        this.fuelqty = 50.5d;
    }

    void start() {
        System.out.println("car started");
    }

    void stop() {
        System.out.println("car stopped");
    }

}
