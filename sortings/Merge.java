package sortings;

import java.util.Arrays;

public class Merge {
    public static void ordering(int[] packs, int start, int mid, int end){
        // determine size of both left and right temp arrays
        int lSize = mid-start+1;
        int rSize = end-mid;
        // create left and right arrays
        int[] left = new int[lSize];
        int[] right = new int[rSize];
        // copy for left and right arrays from original
        for(int lIndex = 0; lIndex<lSize;lIndex++){
            left[lIndex] = packs[lIndex+start];
        }
        for(int rIndex = 0; rIndex <rSize;rIndex++){
            right[rIndex] = packs[rIndex+mid+1];
        }
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        int lIndex = 0, rIndex = 0, index = start;
        // compare
        while(lIndex<lSize&&rIndex<rSize){
            if(left[lIndex]<right[rIndex]){
                packs[index] = left[lIndex];
                lIndex++;
            }else{
                packs[index] = right[rIndex];
                rIndex++;
            }
            index++;
        }
        // copy reminings
        while(lIndex<lSize){
            packs[index] = left[lIndex];
            lIndex++;index++;
        }
        while(rIndex<rSize){
            packs[index] = right[rIndex];
            rIndex++;index++;
        }
    }
    public static void sortByDivide(int[] packages,int start, int end){
        // System.out.println(Arrays.toString(Arrays.copyOfRange(packages, start, end+1)));
        if(start<end){
            int mid = start+(end-start)/2;
            sortByDivide(packages, start, mid);
            sortByDivide(packages, mid+1, end);
            ordering(packages, start, mid, end);
        }
    }
    public static void main(String[] args) {
        int[] salaries={8,5,6,15,12,9};
        sortByDivide(salaries, 0, salaries.length-1);
        System.out.println(Arrays.toString(salaries));
    }
}
