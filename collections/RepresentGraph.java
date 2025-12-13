package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepresentGraph {
    private Map<Character,List<Character>> adjancency;
    public RepresentGraph(){
        adjancency = new HashMap<>();
    }
    public void buildEdges(char vertex1, char vertex2){
        adjancency.putIfAbsent(vertex1, new ArrayList<>());
        adjancency.putIfAbsent(vertex2, new ArrayList<>());
        adjancency.get(vertex1).add(vertex2);
        adjancency.get(vertex2).add(vertex1);
    }
    public static void main(String[] args) {
        RepresentGraph graph = new RepresentGraph();
        graph.buildEdges('A', 'B');
        graph.buildEdges('B', 'C');
        graph.buildEdges('C', 'D');
        graph.buildEdges('B', 'D');
        graph.buildEdges('D', 'E');
        graph.buildEdges('A', 'E');
        System.out.println(graph.adjancency);
    }
}
