package LambdaExpression;
@FunctionalInterface
interface MyLambda4 {
    public void display(String str);
}
public class StaticMethodReferenceDemo {
    
    public static void reverse(String str) // static method sss

    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        MyLambda4 ml =  StaticMethodReferenceDemo::reverse; // for static method sss
        ml.display("hello");
    }
}
