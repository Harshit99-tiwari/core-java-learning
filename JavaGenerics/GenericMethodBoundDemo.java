package JavaGenerics;

public class GenericMethodBoundDemo {
    /**
     * 
     * @param <E> with bound,it can without bound also
     * 
     */
    static <E extends Number> void show(E... list)
    {
        for(E x:list)
            System.out.println(x);
    }
    public static void main(String[] args) {
        show(10,30,30);
    }
}
