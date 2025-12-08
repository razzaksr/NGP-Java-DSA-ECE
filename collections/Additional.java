package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Additional {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(90,89,45,67,90,12,36);
        System.out.println(myList);
        Collections.replaceAll(myList, 90, 44);
        System.out.println(myList);
        System.out.println("Max value "+Collections.max(myList));
        // Collections.reverse(myList);
        Collections.sort(myList);
        System.out.println(myList);

    }
}
