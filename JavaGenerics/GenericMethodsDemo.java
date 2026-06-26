package JavaGenerics;

public class GenericMethodsDemo {
    static <E> void show(E[] list)
    {
      for(E x:list)
        System.out.println(x);
    }
    public static void main(String[] args) {
        show(new String[]{"hii","hello","who"});
        show(new Integer[]{10,20,30,40});
    }
}
