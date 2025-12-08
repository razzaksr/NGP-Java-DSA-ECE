package collections;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Double> myLink = new LinkedList<>();
        myLink.add(9.8);myLink.addLast(2.7);
        myLink.add(6.7);myLink.addFirst(8.1);
        myLink.add(2,6.1);
        System.out.println(myLink);
        myLink.remove();// myLink.removeFirst()
        System.out.println(myLink.getFirst());
        myLink.removeLast();
        System.out.println(myLink.getLast());
        myLink.remove(1);
        System.out.println(myLink.get(1));
    }
}
