package Collections;
import java.util.*;
import java.util.Map.*;
public class TreemapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm  = new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D",4,"E",5,"F"));
        tm.put(7, "G");
        tm.put(10, "H");
        Entry<Integer,String> e = tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());

        System.out.println(tm.ceilingKey(8));
        System.out.println(tm.higherKey(7));
        System.out.println(tm.containsKey(7));
        System.out.println(tm.get(3));
        System.out.println(tm);
    }
}
