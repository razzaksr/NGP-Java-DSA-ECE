package slidingwindow;

import java.util.Arrays;

public class ReverseInFixed {
    public static void reversing(int[] arr, int window){
        int size = arr.length, start=0, end=0 ;
        for(int index=0;index<size;index+=window){
            start = index;
            end = index+window-1;
            if(end>size-1) return;
            while(start<end){
                arr[start]^=arr[end];
                arr[end]^=arr[start];
                arr[start]^=arr[end];
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        reversing(arr1, 2);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {1,2,3,4,5};
        reversing(arr2, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
