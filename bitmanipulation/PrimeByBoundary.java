package bitmanipulation;

import java.util.Arrays;

public class PrimeByBoundary {
    public static boolean isPrime(int number){
        if(number==2||number==3||number==5||number==7||number%2!=0&&number%3!=0&&number%5!=0&&number%7!=0)
            return true;
        return false;
    }
    public static void find(int[] arrA, int[] arrB){
        int[] result = new int[arrA.length];
        Arrays.fill(result, -1);
        for(int index=0;index<arrA.length;index++){
            int sub = arrB[index] - arrA[index];
            if(isPrime(sub)&&sub>arrA[index])
                result[index] = sub;
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7};
		int[] arr2 = {10, 15, 20};
        int[] arr3 = {4, 6, 8};
		int[] arr4 = {5, 10, 15};
        find(arr3, arr4);
        find(arr1, arr2);
    }
}
