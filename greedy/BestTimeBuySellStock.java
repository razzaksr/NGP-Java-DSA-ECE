package greedy;

public class BestTimeBuySellStock {
    public static void findBestTime(int[] arr){
        if(arr.length<2) return;
        int cBuy = arr[0], cSell = arr[1];
        int mProfit = cSell-cBuy;
        int cProfit = Integer.MIN_VALUE;
        for(int index = 1; index<arr.length;index++){
            cProfit = arr[index]-cBuy;
            if(mProfit<cProfit){
                mProfit=cProfit;
                cSell = arr[index];
            }
            if(arr[index]<cBuy) cBuy=arr[index];
        }
        System.out.println("Best time to Buy "+
            (cSell-mProfit)+" sell "+cSell);
    }
    public static void main(String[] args) {
        findBestTime(new int[]{7, 1, 5, 3, 6, 4});
        findBestTime(new int[]{45, 12, 3, 10, 50});
        findBestTime(new int[]{90, 40, 20, 10, 4});
        findBestTime(new int[]{10,6,4,8,2});
        findBestTime(new int[]{-10, -5, -2, -1, 1});
        findBestTime(new int[]{3, 2, 6, 5, 0, 3});
        findBestTime(new int[]{10, 8, 7, 5, 2});
    }
}
