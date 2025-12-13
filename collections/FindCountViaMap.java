package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindCountViaMap {
    public static void main(String[] args) {
        List<String> ece = Arrays.asList(
            "Capgemini","TCS","CTS","Wipro","TCS",
            "CTS","Wipro","Wipro","Capgemini","Infosys",
            "Kaar","Infoview","Wipro","LTIMindtree","IBM"
        );
        Map<String,Integer> stats =new TreeMap<>();
        // iterate and find count
        for(String each:ece){
            int exists = stats.
            getOrDefault(each, 0);
            stats.put(each,exists+1);
        }
        System.out.println(stats);
    }
}
