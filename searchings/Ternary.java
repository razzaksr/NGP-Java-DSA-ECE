package searchings;

import java.util.Arrays;

public class Ternary {

    public static void search(String[] arr, String enquiry, int start, int end){
        while(start<=end){
            int midOne = start+(end-start)/3;
            int midTwo = end-(end-start)/3;
            if(arr[midOne].equals(enquiry)){
                System.out.println(midOne+" day when "+enquiry);
                return;
            }
            if(arr[midTwo].equals(enquiry)){
                System.out.println(midTwo+" day when "+enquiry);
                return;
            }
            // find the partition among 3 where we can alternate boundary
            // check whether it exists in partition1
            if(enquiry.compareTo(arr[midOne])<0)
                end = midOne-1;
            // check whether it exists inpartition 3
            else if(enquiry.compareTo(arr[midTwo])>0)
                start = midTwo+1;
            // check its exists in partition 2
            else
                start=midOne+1;end=midTwo-1;
        }
        System.out.println(enquiry+" hasn't found");
    }

    public static void main(String[] args) {
        String[] campus = {"zoho","capgemeni","infosys","mindtree","capgemeni","google","amazon"};
        Arrays.sort(campus);
        search(campus, "capgemeni",0,campus.length-1);
        search(campus, "cognizant",0,campus.length-1);
        search(campus, "tcs",0,campus.length-1);
    }
}
