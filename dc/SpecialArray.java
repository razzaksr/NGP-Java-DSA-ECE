package dc;

public class SpecialArray {
    public static int findMistery(int[] arr){
        int start = 0, end = arr.length;
        int count = 0, mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            count = findCount(arr, mid);
            if(count == mid) return mid;
            else if(count>mid) start= mid+1;
            else end = mid-1;
        }
        return -1;
    }
    public static int findCount(int[] arr, int mid){
        int temp = 0;
        for(int each : arr)if(each>=mid) temp++;
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(findMistery(
            new int[]{3,5}
        ));
        System.out.println(findMistery(
            new int[]{0,0}
        ));
        System.out.println(findMistery(
            new int[]{3,6,7,7,0}
        ));
        System.out.println(findMistery(
            new int[]{0,4,3,0,4}
        ));
        System.out.println(findMistery(
            new int[]{7,7,0,6,3}
        ));
        System.out.println(findMistery(
            new int[]{7,4,0,6,3}
        ));
        System.out.println(findMistery(
            new int[]{1,1,1}
        ));
        System.out.println(findMistery(
            new int[]{1,2,3,4,5}
        ));
    }
}
