package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import oop.Mobile;

public class PerformSort {
    public static void main(String[] args) {
        Mobile mob1 = new Mobile();
        mob1.ram=16;mob1.cost=19600.9;mob1.model="Vivo V25";
        Mobile mob2 = new Mobile();
        mob2.ram=8;mob2.cost=15600.9;mob2.model="IQoo z3";
        List<Mobile> amazon = new ArrayList<>();
        amazon.add(mob1);amazon.add(mob2);
        // Collections.sort(amazon,new ModelDesc());
        // Collections.sort(amazon,(o1,o2)->o1.cost.compareTo(o2.cost));
        Collections.sort(amazon,(o1,o2)->o2.ram.compareTo(o1.ram));
        System.out.println(amazon);
    }
}

class ModelDesc implements Comparator<Mobile>{
    @Override
    public int compare(Mobile o1, Mobile o2) {
        return o2.model.compareTo(o1.model);
    }
}


