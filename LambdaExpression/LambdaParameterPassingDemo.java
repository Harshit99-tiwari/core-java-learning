package LambdaExpression;


@FunctionalInterface
interface MyLambda3
{
    public void display();
}

class useLambda
{
    public void callLambda(MyLambda3 ml)
    {
        ml.display();
    }
}
class Demoo
{
    public void meth1()
    {
        useLambda ul = new useLambda();
        ul.callLambda(()->{System.out.println("Hello");}); //passing method as a parameter
    }
}

public class LambdaParameterPassingDemo {
    public static void main(String[] args) {
         Demoo d = new Demoo();
        d.meth1();
    }
}
