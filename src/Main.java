public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 8);
        graph.addEdge(2, 4, 2);
        graph.addEdge(3, 4, 7);

        System.out.println("GRAPH:");

        graph.printGraph();

        graph.dijkstra(0);
    }
}