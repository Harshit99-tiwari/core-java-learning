package Inheritance;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Addition of 2 numbers: " + c.add(10, 20));
        System.out.println("Addition of 3 numbers: " + c.add(10, 20, 30));
        System.out.println("Addition of double numbers: " + c.add(5.5, 4.5));
    }
}

class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 (Overloaded)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 (Overloaded)
    double add(double a, double b) {
        return a + b;
    }
}
