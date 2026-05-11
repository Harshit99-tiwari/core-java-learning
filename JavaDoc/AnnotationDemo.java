package JavaDoc;


class Parent
{
  public void display(){}
  @Deprecated
  public void show(){}

}
class chile extends Parent
{
    @Override
 public void display(){}
 
}
class My<T>
{
    @SafeVarargs
    private void show(T...arg)
    {
        for(T x:arg)
            System.out.println(x);
    }
}
/**
 * take only one method->>>functional interface
 */
@FunctionalInterface
interface Myy
{
    public void show();
  //  public int add(int x);
}
 //@SuppressWarnings("unchecked")

public class AnnotationDemo {
    public static void main(String[] args) {
        
    }
}
