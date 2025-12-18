package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {
    public static void findSum(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        int left = 0 , right = 0, sum = 0;
        Arrays.sort(arr);
        for(int index = 0; index < arr.length-2; index++){
            if(index>0&&arr[index]==arr[index-1])continue;
            left = index+1; right = arr.length - 1;
            while(left<right){
                sum = arr[index] + arr[left] + arr[right];
                if(sum==0){
                    result.add(Arrays.asList(arr[index],arr[left],arr[right]));
                    while(left<right&&arr[left]==arr[left+1]) left++;
                    while(left<right&&arr[right]==arr[right-1])right--;
                    left++;
                    right--;
                }
                else if(sum<0) left++;
                else right--;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        findSum(new int[]{-1,0,1,2,-1,-4});
        findSum(new int[]{0,1,1});
        findSum(new int[]{0,0,0});
    }
}
