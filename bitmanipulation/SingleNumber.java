package bitmanipulation;

public class SingleNumber {
    public static int findOut(int[] arr){
        int result = 0;
        for(int each:arr)
            result ^= each;
        return result;
    }
    public static void main(String[] args) {
        int[] nums= {4,1,2,1,2};
        int recieved = findOut(nums);
        System.out.println(recieved);
        recieved = findOut(new int[]{2,2,1});
        System.out.println(recieved);
        recieved = findOut(new int[]{1});
        System.out.println(recieved);
    }
}
