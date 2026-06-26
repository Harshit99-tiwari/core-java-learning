package LambdaExpression;

@FunctionalInterface
interface MyLambda6
{
    public void display(String str);
}
public class ConstructorReferenceDemo
{
      public  ConstructorReferenceDemo(String s)
    {
     System.out.println(s.toUpperCase());
    }
    public static void main(String[] args) {
        MyLambda6 ml =  ConstructorReferenceDemo::new;
        ml.display("hello");
    }
}