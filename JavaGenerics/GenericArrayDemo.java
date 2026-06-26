package JavaGenerics;
@SuppressWarnings("unchecked")
public class GenericArrayDemo<T>
 {
    /**
     * this is generic array which store any type of data
     * like Template in C++
     */
    T data[] = (T[])  new Object[3];  
    public static void main(String[] args) {
         GenericArrayDemo<String> ge = new  GenericArrayDemo<>();
        ge.data[0] = "hii";
        ge.data[1] = "bye";
      //  ge.data[2] = 10;
      String str = ge.data[0];
      System.out.println(str);
    }
}
