package Collections;

import java.util.*;
class MyComp implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2) return 1;
        if(o1>o2) return -1;
        return 0;
    }
}

public class PriorityQueue1demo {
    public static void main(String[] args) {
        //using MAX HEAP
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp());
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
