package JavaGenerics;

class data<T>
{
  private T obj;

  public void Setdata(T v)
  {
    obj = v;
  }
  public T getdata()
  {
    return obj;
  }
}

public class GenericClassDemo{
    public static void main(String[] args) {
        data<Integer> d = new data<>();
        d.Setdata(10);
         System.out.println(d.getdata());
         
        data<String> d1 = new data<>();
        d1.Setdata("hii");
        System.out.println(d1.getdata());
       
    }
}
