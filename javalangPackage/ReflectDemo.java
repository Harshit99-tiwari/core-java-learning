package javalangPackage;
import java.lang.reflect.*;

class I
{
  private int a;
  protected int b;
  public int c;
  int d;

  public I(){}

  public I(int x,int y) {}

  public void display(String s1,String s2) {}
  public int show(int x,int y){return 0;}
}

public class ReflectDemo {
    public static void main(String[] args) {
        Class c=I.class;
       Field field[] =  c.getDeclaredFields();
       for(Field f:field)
           System.out.println(f);

       Constructor con[] = c.getConstructors();
       for(Constructor cn:con)
            System.out.println(cn);
     Method meth[] = c.getMethods();
     for(Method m:meth)
        System.out.println(m);

    Parameter param[] =  meth[0].getParameters();
    for(Parameter p:param)
        System.out.println(p);
     //  System.out.println(c.getName());

    }
}