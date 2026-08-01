package Collections;
import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        //using MEAN HEAP
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(4);
        pq.add(15);
        pq.add(1);
        System.out.println("Peek: "+pq.peek());
        pq.forEach((x)->System.out.println(x));
        System.out.println("After deletion");
        pq.poll();
        pq.forEach((x)->System.out.println(x));

    }
}
