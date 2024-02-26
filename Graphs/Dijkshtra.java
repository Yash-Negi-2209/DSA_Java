import java.util.*;
public class Dijkshtra {

    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static class Pair implements Comparable<Pair>{
        int node; 
        int dist;

        public Pair(int n, int dis){
            this.node = n;
            this. dist = dis;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist; //ye ascending ke lie hai
            // agar descending me krna hota to p2.dist - this.dist
        }
    }
    

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }


    // O(E + ElogV)
    public static void Dij(ArrayList<Edge> graph[], int source, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        for (int i=0; i<V; i++){
            if (i != source){
                dist[i] = Integer.MAX_VALUE;   // basically infinity 
            }
        }
        boolean vis[] = new boolean[V];

        pq.add(new Pair(0, 0));

        // bfs
        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if (!vis[curr.node]){
                vis[curr.node] = true;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;

                    if (dist[u] + e.wt < dist[v]){   //relaxation
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        for (int i=0; i<V; i++){
                System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int V = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        Dij(graph, 0, V);
    }
}
