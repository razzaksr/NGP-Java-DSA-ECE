package arrays;

import java.util.Arrays;

public class PivotalIndex {
    public static int findPivot(int[] arr){
        int totalSum = Arrays.stream(arr).sum();
        int partSum = 0;
        for(int index = 0; index<arr.length;index++){
            if(partSum == (totalSum-partSum-arr[index]))
                return index;
            partSum+=arr[index];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] case1 = {1, 7, 3, 6, 5, 6};
        int[] case2 = {-7, 1, 5, 2, -4, 3, 0};
        int[] case3 = {0,-3,5,-4,-2,3,1,0};
        int[] case4 = {1,3,5,2,2};
        System.out.println(findPivot(case1));
        System.out.println(findPivot(case2));
        System.out.println(findPivot(case3));
        System.out.println(findPivot(case4));
    }
}
