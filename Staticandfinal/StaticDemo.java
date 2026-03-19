package Staticandfinal;

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("showroom price of hondacity" + Hondacity.price);
        System.out.println("hondacity price on mumbai onroad" + Hondacity.OnroadPrice("delhi"));
        System.out.println("hondacity price on mumbai onroad" + Hondacity.OnroadPrice("mumbai"));
    }
}

class Hondacity {
    static long price = 10; // static variable

    static double OnroadPrice(String city) { // static method
        switch (city) {
            case "delhi":
                return (price + price * 0.10);
            case "mumbai":
                return price + price * 0.9;
        }
        return price;
    }
}
