import java.util.*;

public class Graph {

    private int V;

    private LinkedList<Edge>[] adj;

    public Graph(int vertices) {

        V = vertices;

        adj = new LinkedList[V];

        for (int i = 0; i < V; i++) {

            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int from, int to, int weight) {

        Vertex source = new Vertex(from);
        Vertex destination = new Vertex(to);

        adj[from].add(new Edge(source, destination, weight));

        // undirected graph
        adj[to].add(new Edge(destination, source, weight));
    }

    public void printGraph() {

        for (int i = 0; i < V; i++) {

            System.out.print("AdjList[" + i + "]: ");

            for (Edge edge : adj[i]) {

                System.out.print(
                        edge.getDestination().getId()
                                + "("
                                + edge.getWeight()
                                + ") "
                );
            }

            System.out.println();
        }
    }

    // DIJKSTRA
    public void dijkstra(int start) {

        int[] distance = new int[V];

        boolean[] visited = new boolean[V];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[start] = 0;

        for (int i = 0; i < V - 1; i++) {

            int u = findMinDistance(distance, visited);

            visited[u] = true;

            for (Edge edge : adj[u]) {

                int v = edge.getDestination().getId();

                int weight = edge.getWeight();

                if (!visited[v]
                        && distance[u] != Integer.MAX_VALUE
                        && distance[u] + weight < distance[v]) {

                    distance[v] = distance[u] + weight;
                }
            }
        }

        printDijkstra(distance, start);
    }

    private int findMinDistance(int[] distance,
                                boolean[] visited) {

        int min = Integer.MAX_VALUE;

        int minIndex = -1;

        for (int i = 0; i < V; i++) {

            if (!visited[i]
                    && distance[i] < min) {

                min = distance[i];

                minIndex = i;
            }
        }

        return minIndex;
    }

    private void printDijkstra(int[] distance,
                               int start) {

        System.out.println(
                "\nShortest distances from vertex "
                        + start + ":"
        );

        for (int i = 0; i < V; i++) {

            System.out.println(
                    start
                            + " -> "
                            + i
                            + " = "
                            + distance[i]
            );
        }
    }
}