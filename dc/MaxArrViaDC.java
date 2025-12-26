package dc;

public class MaxArrViaDC {
    // Find max in arr from index current to end
    public static int findMax(int[] arr, int current){
        if(current==arr.length) return 0;
        return Math.max(arr[current], 
            findMax(arr, current+1));
    }
    // mid based divide
    public static int findMax(int[] arr, int start, int end){
        if(start==end) return arr[start];
        if(end==start+1) 
            return Math.max(arr[start], arr[end]);
        int mid = start + (end-start)/2;
        int leftMax = findMax(arr, start, mid);
        int rightMax = findMax(arr, mid+1, end);
        return Math.max(leftMax, rightMax);
    }
    public static void main(String[] args) {
        int[] arr1 = {34,12,67,32,11};
        int[] arr2 = {120,97,35,122};
        System.out.println(findMax(
            arr1, 0, arr1.length-1));
        System.out.println(findMax(
            arr2, 0, arr2.length-1));
        // System.out.println(
        //     findMax(new int[]{34,12,67,32,11},0)
        // );
        // System.out.println(
        //     findMax(new int[]{120,97,35,122},0)
        // );
    }
}
