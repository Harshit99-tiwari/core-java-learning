package Collections;
import java.util.*;
//import java.util.Map.*;
public class HashMapDemo {
    public static void main(String[] args) {
          HashMap<Integer,String> tm  = new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D",4,"E",5,"F"));
        tm.put(7, "G");
        tm.put(10, "H");
        System.out.println(tm.keySet());
    
        System.out.println(tm.containsKey(7));
        System.out.println(tm.get(3));
        System.out.println(tm);
    }
}
