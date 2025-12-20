package greedy;

public class CountXinO {
    public static void convert(String str){
        int count = 0;
        for(int index = 0;index<str.length();){
            if(str.charAt(index)=='X'){
                count++; index+=3;
            }
            else index++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        convert("XXX");
        convert("XOXX");
        convert("XXOX");
        convert("OOOO");
    }
}
