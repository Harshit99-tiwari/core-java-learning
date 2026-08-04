package Collections;

import java.util.*;

public class TreesetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 40, 30, 50, 90, 20, 60));
        // Collection<Integer> ts = new TreeSet<>(List.of(10, 40, 30, 50, 90, 20, 60));
        //SortedSet<Integer> ts = new TreeSet<>(List.of(10, 40, 30, 50, 90, 20, 60));

        ts.add(35);
        System.out.println(ts.ceiling(80));
        System.out.println(ts.floor(80));
        System.out.println(ts.getFirst());
        System.out.println(ts.contains(40));

        System.out.println(ts);
    }
}
