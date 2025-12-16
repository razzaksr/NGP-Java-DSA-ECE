package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingInvoice {
    public static void main(String[] args) {
        // List<Integer> invoice = Arrays.asList(14,15,17,18);
        // List<Integer> invoice = Arrays.asList(1,2,3,4);
        List<Integer> invoice = Arrays.
        asList(11,12,14,91,93);
        int min = Collections.min(invoice);
        while(true){
            if(invoice.contains(min)) min=min+1;
            else{
                System.out.println(min+" is missing");
                break;
            }
        }
    }
}
