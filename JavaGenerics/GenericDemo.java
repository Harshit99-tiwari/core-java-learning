package JavaGenerics;

public class GenericDemo {
    public static void main(String[] args) {
    Object obj[] = new Object[3];
    obj[0] = "hii";
    obj[1] = "hello";
    obj[2] = 10;

    String str;

    for(int i =0;i<3;i++)
    {
        str = (String)obj[i];
        System.out.println(str);
    }

        /*Object obj = new String("Hello");
       // obj = new Integer(10);

        String str = (String)obj;
        System.out.println(str);*/
    }
}
