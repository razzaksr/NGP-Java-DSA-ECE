package slidingwindow;

import java.util.List;
import java.util.Map;

public class VariableMinString {
    // if problem statement emphasize on order of appearance
    public static List<String> minWindow(
        List<String> current, List<String> req){
        int start = current.indexOf(req.get(0));
        int end = current.indexOf(req.get(req.size()-1));
        if(end>=start)
            return current.subList(start, end+1);
        else return List.of();
    }
    // sliding window
    public static List<String> optimized(List<String> current,
         List<String> req){
        Map<String, Integer> rTab = new java.util.HashMap<>();
        Map<String, Integer> cTab = new java.util.HashMap<>();
        for(int index= 0 ;index<req.size();index++)
            rTab.put(req.get(index), rTab.getOrDefault(
        req.get(index), 0)+1);
        int end = 0, start = 0, minS = 0;
        int minL=Integer.MAX_VALUE, matched = 0;
        for(;end<current.size();end++){
            cTab.put(
                current.get(end),
                cTab.getOrDefault
                (current.get(end), 0)+1
            );
            if(rTab.containsKey(current.get(end))) 
                matched++;
            while(matched==req.size()){
                // extend the end
                if(minL>=end-start+1){
                    minL = end-start+1;
                    minS = start;
                }
                // shrink the start
                String taken = current.get(start);
                if(cTab.containsKey(taken)){
                    cTab.put(taken, cTab.get(taken)-1);
                    if(cTab.get(taken)<rTab.getOrDefault(taken,0))
                        matched--;
                }
                start++;
            }
        }
        if(minL==Integer.MAX_VALUE) return List.of();
        return current.subList(minS, minS+minL);
    }
    public static void main(String[] args) {
        List<String> current = List.of("browse","search","kart","checkout","feedback");
        List<String> req = List.of("search","checkout");
        System.out.println(optimized(current, req));
        current = List.of("browse","search","kart","feedback");
        req = List.of("search","checkout");
        System.out.println(optimized(current, req));
        current = List.of("browse","search","kart","checkout","feedback");
        req = List.of("search","feedback","checkout");
        System.out.println(optimized(current, req));
        current = List.of("search","feedback","checkout","browse","search","checkout");
        req = List.of("search","checkout");
        System.out.println(optimized(current, req));
    }
}
