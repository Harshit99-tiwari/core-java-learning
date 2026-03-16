package Innerclasses;

public class InnerExample3 {
    public static void main(String[] args) {
        UP u = new UP();
        u.meth();
    }
}

interface you {
    void Display();
}

class UP {
    void meth() {
        you y = new you() {
            public void Display() {
                System.out.println("into hii");
            }
        };
        y.Display();
    }
}