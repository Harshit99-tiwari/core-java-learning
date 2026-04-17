package javalangPackage;

public class Mathclass {
    public static void main(String[] args) {
         System.out.print("Absolute :");
        System.out.println(Math.abs(-121));

        System.out.print("Absolute :");
        System.out.println(StrictMath.abs(-121));

        System.out.print("Cube root: ");
        System.out.println(Math.cbrt(9));

        System.out.print("Exact Decrement: ");
        System.out.println(Math.decrementExact(7));
     //   System.out.println(Math.decrementExact(Integer.MIN_VALUE));

        int i =Integer.MIN_VALUE;
        i--;
        System.out.println(i);

        System.out.print("Exponent value in Floating point Repre. :");
        System.out.println(Math.getExponent(12.3456));

        System.out.print("Round Division :");
        System.out.println(Math.floorDiv(50,9));

        System.out.print("e power x :");
        System.out.println(Math.exp(1));

         System.out.print("e power x :");
         System.out.println(StrictMath.exp(1));

         System.out.print("Log base 10 :");
         System.out.println(Math.log10(100));

         System.out.print("Maximum :");
         System.out.println(Math.max(100,50));

         System.out.print("Tan :");
         System.out.println(Math.tan(45*Math.PI/180));

         System.out.print("Convert to Radians :");
         System.out.println(Math.toRadians(90));

         System.out.print("Convert to Degrees :");
         System.out.println(Math.toDegrees(Math.atan(1)));

         System.out.print("Convert to Degrees :");
         System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));

         System.out.print("Random :");
         System.out.println(Math.random());

         System.out.print("Power :");
         System.out.println(Math.pow(2, 3));

         System.out.print("Exact Product :");
         System.out.println(Math.multiplyExact(100, 200));

         System.out.print("Next float value :");
         System.out.println(Math.nextAfter(12.5, 13));


    }
}
