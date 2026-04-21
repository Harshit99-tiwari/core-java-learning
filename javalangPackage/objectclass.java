package javalangPackage;

class Myobject
{
    public String toString()
    {
        return "My object";
    }
    public int hashCode()
    {
        return 101;
    }
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
}

public class objectclass {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o3 = new Object();
        System.out.println(o1.equals(o3));
        Object o2 = o1;
        System.out.println(o1); // o1 calling tostring
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());

        System.out.println("<<<---Myobject class result--->>>");

        Myobject obj = new Myobject();
        Myobject obj1 = new Myobject();
        System.out.println(obj);
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj1));
    }
}
