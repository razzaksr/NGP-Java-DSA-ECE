package oop;

import java.util.Arrays;

// single inheritance
public class ExecuteInterface implements OnBoarding {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.experience = 13;
        employee.setFullName("Razak Mohamed S");
        ExecuteInterface execute = new ExecuteInterface();
        // we cannot modify
        // execute.role = "Associate Software Engineer";
        System.out.println(execute.role);
        execute.selection();
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public void selection() {
        for(int select = 0; select < arr.length; select++){
            for(int compare=select+1;compare<arr.length;compare++){
                if(arr[select]>arr[compare]){
                    arr[select] += arr[compare];
                    arr[compare] = arr[select] - arr[compare];
                    arr[select] -= arr[compare];
                }
            }
        }
    }
}
interface OnBoarding{
    // data memeber need to be initlaized
    String role="Associate Software Trainee";
    int[] arr = {91,56,21,77,34};
    // abstract method
    public void selection();
}
class Employee{
    // data members no need to initalize manually
    int experience;
    private String fullName;
    // non abstract method>> method with body{}
    public void setFullName(String value){
        this.fullName = value;
    }
}
