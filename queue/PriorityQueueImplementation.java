package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImplementation {
    public static void main(String[] args) {
        // upcasting
        Queue<Integer> queue = new PriorityQueue<>((a,b)->b-a);
        // priority queue always poll smallest element
        queue.offer(78);queue.offer(12);
        queue.offer(12);queue.offer(994);
        queue.offer(79);queue.offer(62);
        System.out.println(queue);
        queue.poll();queue.poll();
        System.out.println(queue);
    }
}
