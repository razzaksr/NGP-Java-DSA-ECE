package collections;

import java.util.ArrayList;
import java.util.List;

public class DemonstrateArrayList {
    public static void main(String[] args){
        List<Character> myList1 = new ArrayList<>();
        myList1.add('W');myList1.add('R');
        myList1.add('T');
        System.out.println("My list one "+myList1);
        List<Character> myList2 = new ArrayList<>();
        myList2.addAll(myList1);
        System.out.println("My list two "+myList2);
        myList1.set(1,'S');
        System.out.println(myList1.get(1));
        myList2.remove(0);
        System.out.println("My list one "+myList1);
        System.out.println("My list two "+myList2);
        // myList1.removeAll(myList2);
        // System.out.println("My list one "+myList1);
        myList1.retainAll(myList2);
        System.out.println("My list one "+myList1);
    }
}
