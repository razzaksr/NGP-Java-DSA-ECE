package queue;

import java.util.PriorityQueue;
import java.util.Queue;

import oop.Mobile;

public class Customize {
    public static void main(String[] args) {
        Mobile mob1 = new Mobile();
        mob1.ram=16;mob1.cost=19600.9;mob1.model="Vivo V25";
        Mobile mob2 = new Mobile();
        mob2.ram=8;mob2.cost=15600.9;mob2.model="iQoo z3";
        Queue<Mobile> ship = new PriorityQueue<>(
            (ob1,ob2)->ob1.model.compareTo(ob2.model)
        );
        ship.offer(mob1);ship.offer(mob2);
        System.out.println("Polled "+ship.poll());
    }
}
