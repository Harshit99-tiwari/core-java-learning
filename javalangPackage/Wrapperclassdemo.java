package javalangPackage;

public class Wrapperclassdemo {
    public static void main(String[] args) {
         Integer i = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b = 14;

        Byte c = 15;
        Byte d = Byte.valueOf("15");
        Byte e = Byte.valueOf(c);

        Short f = Short.valueOf("123");

        Float g = 13.2f;
        Float h = Float.valueOf("232");
        Float x=h.floatValue();
        Float y =h;

        Double j = Double.valueOf(123.546);

        Character k = Character.valueOf('a');

        Boolean l = Boolean.valueOf("true");

       
        int m=10;
        Integer n=Integer.valueOf(m);  //boxing
        


    }
}
