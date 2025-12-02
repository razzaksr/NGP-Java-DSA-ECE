package searchings;

import java.util.Arrays;

public class Binary {
    public static int search(String[] arr, String enquiry,int start, int end){
        if(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid].equals(enquiry)){
                return mid;
            }else if(enquiry.compareTo(arr[mid])<0)
                return search(arr, enquiry, start, mid);
            else
                return search(arr, enquiry, mid+1, end);
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] campus = {"zoho",
        "capgemeni","infosys","mindtree","capgemeni","google","amazon"};
        Arrays.sort(campus);
        System.out.println(search(campus, "capgemeni",0,campus.length-1));
        System.out.println(search(campus, "cognizant",0,campus.length-1));
        System.out.println(search(campus, "tcs",0,campus.length-1));
    }
}
