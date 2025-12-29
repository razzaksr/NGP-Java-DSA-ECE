package dc;

import java.util.Arrays;

public class CuttingRibbons {
    public static int findLength(int[] arr, int target){
        int output = 0;
        int start = 1, mid = 0;
        int end = Arrays.stream(arr).max().getAsInt();
        while(start<=end){
            mid = start+(end-start)/2;
            if(cut(arr, target, mid)){
                output = mid; start = mid+1;
            }else end=mid-1;
        }
        return output;
    }
    public static boolean cut(int[] arr, int target, int mid){
        int temp = 0;
        for(int each:arr){
            temp += each/mid;
            if(temp>=target) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(findLength
            (new int[]{9,7,5},3)
        );
        System.out.println(findLength
            (new int[]{7,5,9},4)
        );
        System.out.println(findLength
            (new int[]{5,5,5},4)
        );
    }
}
