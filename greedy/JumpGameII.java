package greedy;

public class JumpGameII {
    public static int jump(int[] nums){
        int count = 0, end = 0, dist = 0;
        for(int index = 0; index<nums.length-1;index++){
            dist = Math.max(dist,index+nums[index]);
            if(index==end){
                count++;end = dist;
                if(end<=index) return -1;
            }
        }
        return dist>=nums.length-1?count:-1;
    }
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,1,1,4}));
        System.out.println(jump(new int[]{2,3,0,1,4}));
        System.out.println(jump(new int[]{3,2,1,0,4}));
    }
}
