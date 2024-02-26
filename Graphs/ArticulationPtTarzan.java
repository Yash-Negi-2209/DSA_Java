
import java.util.*;
class ArticulationPtTarzan {
    
    public static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }


    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }


    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], boolean vis[], boolean AP[], int time){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if (neigh == par)
            continue;

            else if (vis[neigh]){
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
            else {
                dfs(graph, neigh, curr, dt, low, vis, AP, time);
                low[curr] = Math.min(low[curr], low[neigh]);
                if ( dt[curr]<=low[neigh] && par != -1){
                    AP[curr] = true;
                }
                children++;
            }
        }

        if (par == -1 && children>1){
            AP[curr] = true;
        }
    }

    public static void getAP(ArrayList<Edge> graph[], int V){
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean AP[] = new boolean[V];

        for (int i=0; i<V; i++){
            if (!vis[i]){
                dfs(graph, i, -1, dt, low, vis, AP, time);
            }
        }

        // to print
        for (int i=0; i<V; i++){
            if (AP[i]){
                System.out.println("Articulation point is : "+i);
            }
        }
    }
    


    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getAP(graph, V);
    }
}

