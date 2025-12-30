package dp;

public class DecodeViaDP {
    public static int ways(String str){
        if(str == null || str.length() == 0) return 0;
        int size = str.length(), single=0, dbl=0;
        int[] dp = new int[size+1];
        dp[0]=1;
        dp[1] = str.charAt(0)!='0' ? 1:0;
        for(int index = 2;index<=size;index++){
            single = str.charAt(index-1)-'0';
            if(single>=1&&single<=9) dp[index]+=dp[index-1];
            String sub = str.substring(index-2, index);
            dbl = Integer.parseInt(sub);
            if(dbl>=10&&dbl<=26)dp[index]+=dp[index-2];
        }
        return dp[size];
    }
    public static void main(String[] args) {
        System.out.println(ways("12"));
        System.out.println(ways("226"));
        System.out.println(ways("2206"));
        System.out.println(ways("06"));
        System.out.println(ways("1169217"));
        System.out.println(ways("11106"));
    }
}
