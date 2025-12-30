package dp;

import java.util.Arrays;

public class CoinChange {
    public static int count(int[] den, int req){
        if(den.length==0 || req<=0) return -1;
        int init = req+1;
        int[] dp = new int[init];
        Arrays.fill(dp, init);
        dp[0]=0;
        for(int cur:den){
            for(int index = cur;index<=req;index++){
                dp[index]=Math.min(dp[index], 
                    dp[index-cur]+1);
            }
        }if(dp[req]<init) return dp[req];
        else return -1;
    }
    public static void main(String[] args) {
        System.out.println(
            count(new int[]{100,500,200},1100)
        );
        System.out.println(
            count(new int[]{100,200,500},8700)
        );
        System.out.println(
            count(new int[]{500,200},1100)
        );
        System.out.println(
            count(new int[]{500,200},1300)
        );
        System.out.println(
            count(new int[]{500,200},100)
        );
    }
}
