package Collections;
import java.util.*;
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "c");
        ht.put(4, "D");
        ht.put(5, "E");

        Enumeration<Integer> e = ht.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        ht.compute(2, (k,v)->v+"Z");
        ht.computeIfAbsent(7, (k)->"Z"+k);
         System.out.println(ht);
    }
}
