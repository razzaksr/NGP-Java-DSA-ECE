package searchings;

import java.util.Scanner;

public class Linear {
    private static Scanner scanner=new Scanner(System.in);
    public static void  search(String[] arr, String enquiry){
        int size = arr.length;
        for(int index=0; index<size; index++){
            if(arr[index].equals(enquiry)){
                System.out.println(index+" day when "+enquiry+" visted");
                System.out.println("Do wish to search next "+enquiry);
                boolean response = scanner.nextBoolean();
                if(response) continue;
                else return;
            }
        }
        System.out.println(enquiry+" is not available");
    }
    public static void main(String[] args) {
        String[] campus = {"zoho","capgemeni","infosys","mindtree","capgemeni","google","amazon"};
        search(campus, "capgemeni");
        search(campus, "cognizant");
        search(campus, "tcs");
    }
}
