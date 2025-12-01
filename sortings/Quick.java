package sortings;

import java.util.Arrays;

public class Quick {
    public static int findPivotalPoint(int[] packs, int start, int end){
        int pivotalData = packs[end];
        int initial = start - 1;
        for(int current = start; current < end; current++){
            if(packs[current]>=pivotalData){
                initial++;
                // swap b/w current, initial
                int third = packs[current];
                packs[current] = packs[initial];
                packs[initial] = third;
            }
        }
        // always swap b/w initial+1 and end
        int third = packs[initial+1];
        packs[initial+1] = packs[end];
        packs[end] = third;
        return initial+1;
    }
    public static void divide(int[] packs, int start, int end){
        if(start<end){
            int pivotalPoint = findPivotalPoint(packs,start,end);
            divide(packs, start, pivotalPoint-1);
            divide(packs, pivotalPoint+1, end);
        }
    }
    public static void main(String[] args) {
        int[] salaries={8,5,6,15,12,9};
        divide(salaries, 0, salaries.length-1);
        System.out.println(Arrays.toString(salaries));
    }
}
