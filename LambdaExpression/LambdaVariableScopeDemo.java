package LambdaExpression;
@FunctionalInterface
interface MyLambda2
{
    public void display();
}
class Demo
{
    int temp = 10;  //instance variable
   public void method1()
   {
    final int c = 0;
     MyLambda2 m = ()->{
        int count=0;
        count++;
        System.out.println("hii "+c);
        System.out.println("hello "+(count++)+(temp++));
      };
      m.display();
     
   }
}
public class LambdaVariableScopeDemo {
      public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
