package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordering {
    public static void main(String[] args) {
        List<Integer> myNumber = new ArrayList<>();
        myNumber.add(98);myNumber.add(12);myNumber.add(14);
        myNumber.add(27);myNumber.add(31);
        Collections.sort(myNumber);
        System.out.println(myNumber);
    }
}
