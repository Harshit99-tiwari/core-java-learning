package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new  LinkedList<>();
         LinkedList<Integer> al2 = new  LinkedList<>(List.of(50, 60, 70, 80, 90));

        al1.add(10);
        al1.add(0, 20);
        al1.addAll(1, al2);
        System.out.println(al1);
        System.out.println(al1.contains(50));
        System.out.println(al1.contains(99));
        al1.add(1, 70);
        System.out.println(al1.size());
        System.out.println(al1.isEmpty());
        System.out.println(al1.get(5));
        System.out.println(al1.set(0, 100));
        System.out.println(al1);
        System.out.println(al1.indexOf(70));
        System.out.println(al1.lastIndexOf(70));
        al1.remove(5);
        al1.addFirst(44);
        al1.addLast(333);
        System.out.println(al1.peek());
    

        // Traversing ArrayList through loop
        /*
         * for(int i =0;i<al1.size();i++)
         * System.out.print(al1.get(i)+" ");
         * for(var x:al1)
         * System.out.print(x+" ");
         */

        al1.forEach(n -> show(n));

    }

    static void show(int n) {
       // if (n > 60)
            System.out.print(n + " ");
    }
}
