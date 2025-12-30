package dp;

public class Tribonacci {
    public static int findNth(int number){
        if(number<=0) return 0;
        else if(number==1||number==2) return 1;
        int[] dp = new int[number+1];
        dp[0]=0; dp[1]=1;dp[2]=1;
        for(int index = 3;index<=number;index++){
            dp[index]=dp[index-1]+dp[index-2]+dp[index-3];
        }
        return dp[number];
    }
    public static void main(String[] args) {
        System.out.println(findNth(4));
        System.out.println(findNth(10));
        System.out.println(findNth(25));
    }
}
