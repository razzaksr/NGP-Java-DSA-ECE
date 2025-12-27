package dc;

public class FindInsertionPoint {
    public static int whereToInsert(int[] arr, int next){
        int start = 0, end = arr.length-1, mid = 0;
        while(start<=end){
            mid = start + (end - start) / 2;
            if(arr[mid]==next) return mid;
            else if(arr[mid]<next) start = mid+1;
            else end = mid-1;
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(whereToInsert(arr, 5));
        System.out.println(whereToInsert(arr, 2));
        System.out.println(whereToInsert(arr, 7));
    }
}
