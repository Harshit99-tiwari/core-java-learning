package LambdaExpression;

@FunctionalInterface
interface MyLambda {
    public void display();

}

interface MyLambda1 {
    public int add(int x, int y);

}

interface MyLambda2 {
    public int mul(int x, int y);
}

public class LambdaFunctionalInterfaceDemo {
    public static void main(String[] args) {
        MyLambda l = () -> {
            System.out.println("Hello World");
        };
        l.display();

        MyLambda1 m = (a, b) -> a + b;
        System.out.println("Add: " + m.add(20, 30));

        MyLambda2 m2 = (a, b) -> a * b;
        System.out.println("Mul :" + m2.mul(3, 10));
    }
}
