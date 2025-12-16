package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MovingZeros {
    public static void viaList(int[] arr){
        ArrayList<Integer> nums = new ArrayList<>() ;
        int zeroCount = 0;
        for(int each:arr){
            if(each!=0)
                nums.add(each);
            else zeroCount++;
        }
        while(zeroCount>0){
            nums.add(0);zeroCount--;
        }
        System.out.println(nums); 
    }
    public static void viaTwoPointer(int[] arr){
        int index = 0, valid = 0;
        while(index<arr.length){
            if(arr[index]!=0){
                arr[valid] = arr[index];valid++;
            }
            index++;
        }
        Arrays.fill(arr, valid,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr1 = {20,0,19,5,0,3,10,0,2};
        viaTwoPointer(arr1);
        int[] arr2 = {0, 1, 0, 3, 12};
        viaTwoPointer(arr2);
        int[] arr3 = {3,0,0,1,0,5,0,6,0};
        viaTwoPointer(arr3);
    }
}






/*
List<Integer> nums = Arrays.asList(20,0,19,5,0,3,10,0,2);
        int oldCount = nums.size(), zeroCount = 0;
        nums = nums.stream().filter(each->{
            return each!=0;
        }).toList();
        int newCount = nums.size();
        zeroCount = oldCount - newCount;
        while(zeroCount>0){
            nums.add(0);zeroCount--;
        }
        System.out.println(nums); 
*/