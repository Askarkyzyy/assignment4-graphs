public class Main {

    public static void main(String[] args) {

        // small graph
        Graph graph = new Graph(10);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 7);
        graph.addEdge(4, 8);
        graph.addEdge(5, 9);

        System.out.println("GRAPH:");

        graph.printGraph();

        Experiment experiment = new Experiment();

        experiment.runTraversals(graph);

        experiment.runMultipleTests();

        experiment.printResults();
    }
}