package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Behaviour {
    public static void main(String[] args) {
        Queue<String> strQueue = new PriorityQueue<>(
            (ob1,ob2)->ob2.compareTo(ob1)
        );
        strQueue.offer("Razak");
        strQueue.offer("MOhamed");
        strQueue.offer("Balaji");
        System.out.println("Polled "+strQueue.poll());
        Queue<Integer> intQueue = new PriorityQueue<>(
            (ob1,ob2)->ob2-ob1
        );
        intQueue.offer(12);intQueue.offer(92);
        intQueue.offer(26);intQueue.offer(44);
        System.out.println("Polled "+intQueue.poll());
    }
}
