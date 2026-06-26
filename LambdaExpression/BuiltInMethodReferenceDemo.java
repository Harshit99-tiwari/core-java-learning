package LambdaExpression;

interface MyLambda7
{
    public int display(String str1,String str2);
}
public class BuiltInMethodReferenceDemo
{
        public static void main(String[] args) {
        MyLambda7 ml = String::compareTo;

        System.out.println(ml.display("hello","hebllo"));
    }
}