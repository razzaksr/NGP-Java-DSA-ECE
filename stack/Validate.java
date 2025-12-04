package stack;

import java.util.Scanner;
import java.util.Stack;

public class Validate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Character> stk = new Stack<>();
        System.out.println("Enter th expression ");
        String expression = scan.next();// {)
        char[] chars = expression.toCharArray();
        // type var:array
        for(char each : chars ){
            if(each=='{'||each=='('||each=='[')
                stk.push(each);
            else if(each=='}'||each==')'||each==']'){
                if(stk.isEmpty()){
                    System.out.println("Invalid");
                    return;
                }
                char received = stk.pop();
                if(each=='}'&&received!='{'||
                each==']'&&received!='['
                ||each==')'&&received!='('){
                    System.out.println("Invalid");
                    return;
                }
            }
        }
        if(stk.isEmpty())
            System.out.println("Valid");
    }    
}
