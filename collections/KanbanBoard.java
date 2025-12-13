package collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class KanbanBoard {
    private Map<String, List<String>> board;
    public KanbanBoard(){
        board = new Hashtable<>();
        board.putIfAbsent("todo", new ArrayList<>());
        board.putIfAbsent("progress", new ArrayList<>());
        board.putIfAbsent("review", new ArrayList<>());
        board.putIfAbsent("done", new ArrayList<>());
    }
    public void update(String bucket, String task){
        switch(bucket){
            case "todo":
                // todo bucket
                if(!board.get(bucket).contains(task)){
                    board.get(bucket).add(task);
                    System.out.println(task+" moved to "+bucket);
                }else
                    System.out.println(task+" is duplicate");
                break;
            case "progress":
                // progrees bucket
                if(board.get("todo").contains(task)){
                    board.get(bucket).add(task);
                    board.get("todo").remove(task);
                    System.out.println(task+" moved to "
                    +bucket+" from todo");
                }else System.out.println("invalid move");
                break;
            case "review":
                // review bucket
                if(board.get("progress").contains(task)){
                    board.get(bucket).add(task);
                    board.get("progress").remove(task);
                    System.out.println(task+" moved to "
                    +bucket+" from progress");
                }else System.out.println("invalid move");
                break;
            case "done":
                // done bucket
                if(board.get("review").contains(task)){
                    board.get(bucket).add(task);
                    board.get("review").remove(task);
                    System.out.println(task+" moved to "
                    +bucket+" from review");
                }else System.out.println("invalid move");
                break;
            default: System.out.println("Invalid bucket");
        }
    }
    public static void main(String[] args) {
        KanbanBoard kanban = new KanbanBoard();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1. Todo\n2.Progress\n3.REview\n4.Done\nAny to exit");
            int choice = scanner.nextInt();
            if(choice>4||choice<1) return;
            System.out.println("Enter the name of task ");
            String task = scanner.next();
            if(choice==1) 
                kanban.update("todo",task);
            else if(choice==2) 
                kanban.update("progress",task);
            else if(choice==3) 
                kanban.update("review",task);
            else if(choice==4) 
                kanban.update("done",task);
        }while(true);
    }
}
