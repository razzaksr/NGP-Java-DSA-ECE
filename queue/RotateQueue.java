package queue;

import java.util.LinkedList;
import java.util.Queue;

public class RotateQueue {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        int rotation = 2;
        queue.offer(14);queue.offer(24);
        queue.offer(19);queue.offer(86);
        System.out.println(queue);
        if(rotation<=queue.size()){
            while(rotation>0){
                int temp = queue.poll();
                queue.offer(temp);
                rotation--;
            }
        }else
            System.out.println("Invalid Rotation");
        System.out.println(queue);
    }
}
