package sortings;

import java.util.Arrays;

public class Insertion {
    public static void order(double[] packages){
        int capacity = packages.length;
        for(int index= 1; index<capacity;index++){
            double selected = packages[index];
            int compare = index-1;
            while(compare>=0&&packages[compare]>selected){
                // swap between comapre +1 and compare
                packages[compare+1] = packages[compare];
                compare--;
            }
            packages[compare+1] = selected;
        }
    }
    public static void main(String[] args) {
        double[] salaries={4.5,9.2,12.5,3.5,2.1};
        order(salaries);
        System.out.println(Arrays.toString(salaries));
    }
}
