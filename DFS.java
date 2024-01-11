import java.util.*;

public class DFS {
    static class Graph {
        private int V;
        private List<List<Integer>> adjList;

        public Graph(int vertices) {
            this.V = vertices;
            this.adjList = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) {
                this.adjList.add(new ArrayList<>());
            }
        }

        public void addEdge(int src, int dest) {
            this.adjList.get(src).add(dest);
        }

        public void dfs(int startVertex, boolean[] visited) {
            System.out.print(startVertex + " ");
            visited[startVertex] = true;

            for (int neighbor : adjList.get(startVertex)) {
                if (!visited[neighbor]) {
                    dfs(neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        Graph graph = new Graph(V);

        graph.addEdge(1, 3);
        graph.addEdge(1, 5);
        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(2, 1);
        graph.addEdge(3, 1);
        graph.addEdge(4, 1);
        graph.addEdge(4, 2);
        graph.addEdge(5, 1);

        graph.dfs(2, new boolean[V]);
    }

}
