package queue;


class Bike{
    String model;
    Bike next;
    public Bike(String value){
        model = value;
        next=null;
    }
}

class MyQueue{
    private Bike front, rear;
    public String getFront(){
        return (front!=null)?front.model:"Empty";
    }
    public String getRear(){
        return (rear!=null)?rear.model:"Empty";
    }
    public boolean isEmpty(){
        return front==null;
    }
    public void enqueue(String value){
        Bike obj = new Bike(value);
        if(isEmpty()){
            front=rear=obj;
            System.out.println(value+" added empty queue");
        }
        else{
            rear.next = obj;
            rear=obj;
            obj.next=front;
            System.out.println(value+" added in rear");
        }
    }
    public String dequeue(){
        String removed = "";
        // queue empty
        if(isEmpty()) return "Nothing to dequeue";
        // only one object
        else if(front==rear){
            removed = front.model;
            front=rear=null;
            System.out.println("Queue become empty after removal");
        }
        // many object
        else{
            removed = front.model;
            front=front.next;
            rear.next = front;
            System.out.println("Queue updated");
        }
        return removed;
    }
    public void findAll(){
        Bike travel = front;
        do{
            System.out.println(travel.model+"->");
            travel=travel.next;
        }while(travel!=front);
    }
}




public class ObjectWay {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("Hunter");
        queue.enqueue("Avenger220");
        queue.enqueue("Apache RTR");
        queue.findAll();
        System.out.println("Dequeued "+queue.dequeue());
        queue.findAll();
    }
}
