package sortings;

import java.util.Arrays;

public class Selection {
    public static void sortSelect(int[] packages){
        for(int select=0;select<packages.length;select++){
            for(int compare = select+1; compare<packages.length;compare++){
                // decide when to swap
                if(packages[select]<packages[compare]){
                    packages[select]+=packages[compare];
                    packages[compare] = packages[select] - packages[compare];
                    packages[select] -= packages[compare];
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] salaries={8,5,6,15,12,9};
        sortSelect(salaries);
        System.out.println(Arrays.toString(salaries));
    }
}
