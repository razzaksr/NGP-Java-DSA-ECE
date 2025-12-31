package dp;

public class EditDistance {
    public static int conversion(String str1, String str2){
        int rSize = str1.length();
        int cSize = str2.length();
        int[][] dp = new int[rSize+1][cSize+1];
        for(int row=0;row<=rSize;row++)
            dp[row][0] = row;
        for(int col=0;col<=cSize;col++)
            dp[0][col]=col;
        for(int row=1;row<=rSize;row++){
            for(int col=1;col<=cSize;col++){
                if(str1.charAt(row-1)==str2.charAt(col-1))
                    dp[row][col]=dp[row-1][col-1];
                else{
                    dp[row][col] = 1 + Math.min(
                        dp[row-1][col-1],
                        Math.min(
                            dp[row-1][col],dp[row][col-1]
                        )
                    );
                }
            }
        }
        return dp[rSize][cSize];
    }
    public static void main(String[] args) {
        System.out.println(
            conversion("horse", "ros")
        );
        System.out.println(
            conversion("intention", "execution")
        );
        System.out.println(
            conversion("deep", "sleep")
        );
        System.out.println(
            conversion("horse", "rose")
        );
        System.out.println(
            conversion("madam", "mam")
        );
    }
}
