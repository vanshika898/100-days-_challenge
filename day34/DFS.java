import java.util.*;

public class DFS {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void create(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 5));
        graph[1].add(new Edge(1, 4));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 2));

        graph[5].add(new Edge(5, 1));

    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visit[]) {
        // vist
        System.out.print(curr + " ");
        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dest]) {
                dfs(graph, e.dest, visit);

            }

        }
    }

    public static void main(String[] args) {

        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        dfs(graph, 2, new boolean[V]);

    }
}
