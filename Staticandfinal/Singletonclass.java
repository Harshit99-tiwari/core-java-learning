package Staticandfinal;

class Coffemachine {
    private float coffeqty;
    private float waterqty;
    private float milkqty;
    private float sugarqty;
    static private Coffemachine my = null;

    private Coffemachine() {
        coffeqty = 50;
        waterqty = 10;
        milkqty = 4;
        sugarqty = 5;
    }

    public void fillwater(float qty) {
        waterqty = qty;
    }

    public void fillsugar(float qty) {
        sugarqty = qty;
    }

    public float getCoffe() {
        return 0.23f;
    }

    static public Coffemachine getInstance() {
        if (my == null) {
            my = new Coffemachine();
        }
        return my;
    }
}

public class Singletonclass {
    public static void main(String[] args) {
        Coffemachine c1 = Coffemachine.getInstance();
        Coffemachine c2 = Coffemachine.getInstance();
        Coffemachine c3 = Coffemachine.getInstance();

        System.out.println(c1 + " " + c2 + " " + c3);
        if (c1 == c2 && c1 == c3)
            System.out.println("same");
    }
}
