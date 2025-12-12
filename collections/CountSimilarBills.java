package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CountSimilarBills {
    public static void main(String[] args) {
        // placed list in ece
        List<String> ece = Arrays.asList(
            "Capgemini","TCS","CTS","Wipro","TCS",
            "CTS","Wipro","Wipro","Capgemini","Infosys",
            "Kaar","Infoview","Wipro","LTIMindtree","IBM"
        );
        // remove duplicates
        Set<String> companies = new LinkedHashSet<>(ece);
        // index based implementation
        List<String> finalList = new ArrayList<>(companies);
        // to trace the count
        int[] counts = new int[companies.size()];
        for(String each:ece){
            if(finalList.contains(each))
                counts[finalList.indexOf(each)]++;
        }
        System.out.println(companies);
        System.out.println(Arrays.toString(counts));
    }
}
