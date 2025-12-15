package bitmanipulation;

import java.util.Arrays;

public class CountBitsOfOne {
    public static int[] findAndCount(int size){
        int[] dynamic = new int[size+1];
        if(size>=0)
            dynamic[0]=0;
        // iteration
        for(int index = 1; index <= size; index++){
            dynamic[index]=dynamic[index>>1]+(index&1);
        }
        return dynamic;
    }
    public static void main(String[] args) {
        int[] received = findAndCount(5);
        System.out.println(Arrays.toString(received));
        received = findAndCount(2);
        System.out.println(Arrays.toString(received));
        received = findAndCount(7);
        System.out.println(Arrays.toString(received));
    }
}
