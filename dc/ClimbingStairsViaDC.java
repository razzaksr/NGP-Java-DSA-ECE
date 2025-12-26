package dc;

public class ClimbingStairsViaDC {
    public static int findWays(int stairs){
        if(stairs<=0) return 0;
        else if(stairs==1) return 1;
        else if(stairs==2) return 2;
        else
            return findWays(stairs-1)+findWays(stairs-2);
    }
    public static void main(String[] args) {
        System.out.println(findWays(3));
        System.out.println(findWays(4));
        System.out.println(findWays(5));
        System.out.println(findWays(-2));
        System.out.println(findWays(0));
        System.out.println(findWays(2));
    }
}
