package stack;

class Box{
    int data;
    Box next;
    public Box(int value){
        this.data = value;
        this.next = null;
    }
}

class MyStack{
    private Box top;
    public boolean isEmpty(){
        return (top==null);
    }
    public int peek(){
        return top.data;
    }
    public void push(int value){
        Box fresh = new Box(value);
        if(isEmpty()){
            System.out.println("Stack is empty");
            top = fresh;
        }
        else{
            fresh.next = top;
            top = fresh;
        }
        System.out.println(value+" is pushed");
    }
    public int pop(){
        if(isEmpty()) return -1;
        else{
            int popped = top.data;
            top = top.next;
            return popped;
        }
    }
    public void viewAll(){
        Box move = top;
        System.out.println("Viewing all from top");
        while(move!=null){
            System.out.println(move.data);
            move = move.next;
        }
    }
}

public class ObjectOriented {
    public static void main(String[] args) {
        MyStack stk = new MyStack();
        System.out.println("empty "+stk.isEmpty());
        stk.push(78);stk.push(12);
        stk.push(92);stk.push(57);
        // System.out.println("Top element is "+stk.peek());
        stk.viewAll();
        System.out.println("Deleted element "+stk.pop());
        System.out.println("Deleted element "+stk.pop());
        stk.viewAll();
    }
}
