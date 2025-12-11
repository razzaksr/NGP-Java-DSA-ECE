package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Distinct {
    public static void main(String[] args) {
        Queue<Double> queueOne = new LinkedList<>();
        Queue<Double> queueTwo = new PriorityQueue<>();
        queueOne.offer(9.1);queueOne.offer(7.2);
        queueOne.offer(6.4);queueOne.offer(12.5);
        queueTwo.addAll(queueOne);
        System.out.println(queueOne.poll()+" polled from one");
        System.out.println(queueTwo.poll()+" polled from two");
    }
}
