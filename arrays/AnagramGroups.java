package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class AnagramGroups {
    public static void classify(String[] arr){
        Map<String, List<String>> table = new Hashtable<>();
        for(int index = 0;index<arr.length;index++){
            char[] temp = arr[index].toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            table.putIfAbsent(key, new ArrayList<>());
            table.get(key).add(arr[index]);
        }
        table.values().forEach(v->System.out.println(v));
    }
    public static void main(String[] args) {
        String[] words = 
        {"eat","tea","tan","ate","nat","bat"};
        classify(words);
    }
}
