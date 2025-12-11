package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeQueue {
    public static void main(String[] args) {
        String origin = "razak";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stk = new Stack<>();
        // insert each char in the string to stack and queue
        for(char each:origin.toCharArray()){
            queue.offer(each);  stk.push(each);
        }
        // remove and compare
        while(!queue.isEmpty()&&!stk.isEmpty()){
            if(stk.pop()!=queue.poll()){
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
