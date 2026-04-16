package javalangPackage;

public class FloatWrapperclass {
    public static void main(String[] args) {
        float a = 12.5f;
        Float b = 12.5f;
        Float c = 12.5f/0;
        Float d = -12.5f/0;
        Float e = (float)Math.sqrt(-1);


        System.out.println(b.equals(a));
        System.out.println(c.isInfinite());
        System.out.println(c==Float.POSITIVE_INFINITY);
        System.out.println(d==Float.NEGATIVE_INFINITY);
        System.out.println(e.isNaN());
        System.out.println(e!=Float.NaN);

    }
}
