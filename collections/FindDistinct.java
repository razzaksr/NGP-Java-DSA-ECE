package collections;

import java.util.HashMap;
import java.util.Map;

public class FindDistinct {
    public static void main(String[] args) {
        int[] arr = {11,123,162,43};
        Map<Integer,Integer> analyse = new HashMap<>();
        for(int each:arr){
            while(each>0){
                int digit = each%10;
                int count = analyse.
                getOrDefault(digit, 0);
                analyse.put(digit,count+1);
                each/=10;
            }
        }
        for(int key:analyse.keySet()){
            if(analyse.get(key)==1)
                System.out.println(key);
        }
    }
}
