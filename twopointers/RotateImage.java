package twopointers;

import java.util.Arrays;

public class RotateImage {
    public static void turn(int[][] matrix){
        int size = matrix.length;
        // 1. transpose
        for(int row = 0; row<size; row++){
            for(int column = row+1; column<size; column++){
                // swap
                matrix[row][column] += matrix[column][row];
                matrix[column][row] = matrix[row][column] -
                matrix[column][row];
                matrix[row][column] -= matrix[column][row];
            }
        }
        // 2. reverse
        for(int row = 0; row<size; row++){
            int start = 0, end = size-1;
            while(start<end){
                //swap
                matrix[row][start] ^= matrix[row][end];
                matrix[row][end] ^= matrix[row][start];
                matrix[row][start] ^= matrix[row][end];
                start++;end--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] image = {{1,2,3},{4,5,6},{7,8,9}};
        turn(image);
        for(int[] row:image)
            System.out.println(Arrays.toString(row));
    }
}
