
import java.util.*;
public class KosarajuSCC {

    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph( ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topsort( ArrayList<Edge> graph[], boolean vis[], int curr, Stack<Integer> stack){
        vis[curr] = true;
        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                topsort(graph, vis, e.dest, stack);
            }
        }
        stack.push(curr);
    }

    public static void dfs( ArrayList<Edge> graph[], int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr+" ");
        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void kosarajuAlgo( ArrayList<Edge> graph[], int V){

        //Step-1
        Stack<Integer> stack = new Stack<>();
        boolean vis[] = new boolean[V];
        for (int i=0; i<V; i++){
            if (!vis[i]){
                topsort(graph, vis, i, stack);
            }
        }

        //Step-2
        @SuppressWarnings("unchecked")
         ArrayList<Edge> transpose[] = new ArrayList[V];
         for (int i=0; i<transpose.length; i++){
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
         }
         for (int curr=0; curr<V; curr++){
            for (int j=0; j<graph[curr].size(); j++){
                Edge e = graph[curr].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
         }

        //  Step-3
        while (!stack.isEmpty()){
            int curr = stack.pop();
            if (!vis[curr]){
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosarajuAlgo(graph, V); 
    }
}
