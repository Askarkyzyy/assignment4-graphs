import java.util.*;

public class Graph {

    private int V;
    private LinkedList<Integer>[] adj;

    // constructor
    public Graph(int vertices) {

        V = vertices;

        adj = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addVertex(Vertex v) {

    }

    public void addEdge(int from, int to) {

        adj[from].add(to);
        adj[to].add(from);
    }

    // adjacency list
    public void printGraph() {

        for (int i = 0; i < V; i++) {

            System.out.print("AdjList[" + i + "]: ");

            for (int neighbor : adj[i]) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }

    // BFS
    public void bfs(int start) {

        boolean[] visited = new boolean[V];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;

        queue.add(start);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbor : adj[current]) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;

                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    // DFS
    public void dfs(int start) {

        boolean[] visited = new boolean[V];

        dfsHelper(start, visited);

        System.out.println();
    }

    // recursive DFS
    private void dfsHelper(int vertex, boolean[] visited) {

        visited[vertex] = true;

        System.out.print(vertex + " ");

        for (int neighbor : adj[vertex]) {

            if (!visited[neighbor]) {

                dfsHelper(neighbor, visited);
            }
        }
    }
}
