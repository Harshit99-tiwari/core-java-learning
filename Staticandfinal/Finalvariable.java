package Staticandfinal;

public class Finalvariable {
    final int num;
    final float PI;
    static final int n;
    static {
        n = 6;
    }

    {
        num = 9;
    }

    public Finalvariable() {
        PI = 3.14f;
    }

    public static void main(String[] args) {
      System.out.println(n);
    }
}
