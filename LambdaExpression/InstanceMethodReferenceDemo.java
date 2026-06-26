package LambdaExpression;

@FunctionalInterface
interface MyLambda5
{
    public void display(String str);
}
public class InstanceMethodReferenceDemo
{
     public  void  reverse(String str)    //non static method nss
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb); 
    }
    public static void main(String[] args) {
          InstanceMethodReferenceDemo mr = new InstanceMethodReferenceDemo();  //for non static  nss
          MyLambda5 ml = mr::reverse;    //for non static  nss
      
        ml.display("hello");
    }
}