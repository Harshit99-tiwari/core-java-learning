package OOP;

public class PropertyDemo {
    public static void main(String[] args) {

    }
}

// this format is only for understanding
class Rectangle {
    private double length;

    public double getLength() {
        return length; // read and writable property
    }

    public void setLength(double l) {
        length = l;
    }
}

class Student {
    private int roll; // readonly property

    public int getRollNumber() {
        return roll;
    }
}

class Producer {
    // private int ShareData;
    // write only property
    public void setData(int d) {
        // shareData = d;
    }
}
