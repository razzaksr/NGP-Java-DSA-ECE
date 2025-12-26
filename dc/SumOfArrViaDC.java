package dc;

public class SumOfArrViaDC {
    public static int findSum(int[] arr, int current){
        if(current==arr.length) return 0;
        return arr[current]+findSum(arr,current+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,12,1,7,4};
        System.out.println(findSum(arr,0));
    }
}
