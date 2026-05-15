public class Experiment {

    //  bfs and dfs
    public void runTraversals(Graph g) {

        System.out.println("\nBFS Traversal:");

        long startBFS = System.nanoTime();

        g.bfs(0);

        long endBFS = System.nanoTime();

        System.out.println("BFS Time: "
                + (endBFS - startBFS) + " ns");


        System.out.println("\nDFS Traversal:");

        long startDFS = System.nanoTime();

        g.dfs(0);

        long endDFS = System.nanoTime();

        System.out.println("DFS Time: "
                + (endDFS - startDFS) + " ns");
    }

    // test graphs with different sizes
    public void runMultipleTests() {

        int[] sizes = {10, 30, 100};

        for (int size : sizes) {

            System.out.println("\n====================");
            System.out.println("GRAPH SIZE: " + size);

            Graph g = new Graph(size);

            // creating simple graph
            for (int i = 0; i < size - 1; i++) {

                g.addEdge(i, i + 1);
            }

            runTraversals(g);
        }
    }

    public void printResults() {

        System.out.println("\nAll experiments completed.");
    }
}
