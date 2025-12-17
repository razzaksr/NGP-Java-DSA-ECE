package arrays;

import java.util.Arrays;

public class Rotation {
    public static void performRotate(String[] arr, int shift){
        int size = arr.length;
        String[] clock = new String[size];
        String[] antiClock = new String[size];
        for(int index = 0;index<size;index++){
            clock[(index+shift+size)%size] = arr[index];
            antiClock[(index-shift+size)%size] = arr[index];
        }
        System.out.println("Clock Wise: "+
            Arrays.toString(clock));
        System.out.println("Anti Clock Wise: "+
            Arrays.toString(antiClock));
    }
    public static void main(String[] args) {
        String[] domains = 
        {"DBMS","OS","DSA","Network","AI"};
        performRotate(domains, 2);
    }
}

