package stack;

import java.util.Stack;

public class CollectionImplementation {
    public static void main(String[] args) {
        // non generic
        // Stack common = new Stack();
        // common.push(12);
        // common.push("Razak Mohamed");
        // common.push(7.8);common.push(true);
        // System.out.println(common);
        // common.pop();
        // System.out.println(common.search(true));
        // System.out.println(common.search(12));

        // generic
        Stack<Byte> stk = new Stack<>();
        // stk.push("Razak Mohamed");
        stk.push((byte)12);stk.push((byte)33);
        stk.push((byte)23);stk.push((byte)12);
        stk.push((byte)99);
        System.out.println(stk);
    }
}
