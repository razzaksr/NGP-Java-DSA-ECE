package arrays;

public class ValidateIp {
    public static boolean checkMyIp(String ip){
        String[] portions = ip.split("\\.");
        int num = 0;
        if(portions.length!=4||ip.startsWith(".")||
    ip.endsWith(".")) return false;
        for(String each:portions){
            if(each.length()>3||each=="") return false;
            num = Integer.parseInt(each);
            if(num<0||num>255) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkMyIp("222.111.111.111"));
        System.out.println(checkMyIp("5555..555"));
        System.out.println(checkMyIp("22.0..123"));
        System.out.println(checkMyIp("0.0.0.0255"));
        System.out.println(checkMyIp("121.433.122.111"));
        System.out.println(checkMyIp("192.168.137.12"));
        System.out.println(checkMyIp("1.2.3.4."));
        System.out.println(checkMyIp(".1.2.3.4"));
    }
}
