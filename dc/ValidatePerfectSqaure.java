package dc;

public class ValidatePerfectSqaure {
    public static boolean isValid(int number){
        if(number<2&&number>=0) return true;
        long start = 2, end = number / 2;
        long  mid = 0, sqaure = 0;
        while(start<=end){
            mid = start+(end-start)/2;
            sqaure = mid * mid;
            if(sqaure==number) return true;
            else if(sqaure < number) start = mid+1;
            else end = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValid(16));
        System.out.println(isValid(14));
        System.out.println(isValid(36));
        System.out.println(isValid(25));
        System.out.println(isValid(900));
        System.out.println(isValid(207));
        System.out.println(isValid(105));
        System.out.println(isValid(841));
        System.out.println(isValid(278));
    }
}
