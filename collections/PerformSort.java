package collections;

import java.util.ArrayList;
import java.util.List;

public class PerformSort {
    public static void main(String[] args) {
        Mobile mob1 = new Mobile();
        mob1.ram=16;mob1.cost=19600.9;mob1.model="Vivo V25";
        Mobile mob2 = new Mobile();
        mob2.ram=8;mob2.cost=15600.9;mob2.model="iQoo z3";
        List<Mobile> amazon = new ArrayList<>();
        amazon.add(mob1);amazon.add(mob2);
        System.out.println(amazon);
    }
}

class Mobile{
    Integer ram;
    Double cost;
    String model;
    @Override
    public String toString() {
        return "Mobile [ram=" + ram + ", cost=" + cost + ", model=" + model + "]";
    }
}
