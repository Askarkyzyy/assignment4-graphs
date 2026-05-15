# Assignment 4 – Graph Traversal and Representation System

## Project Overview

This project demonstrates graph representation and traversal algorithms in Java.

The graph is implemented using an adjacency list structure.  
Each graph contains vertices (nodes) and edges (connections between nodes).

The project includes two graph traversal algorithms:

- Breadth-First Search (BFS)
- Depth-First Search (DFS)

The program also measures execution time for graphs of different sizes.

---

# Graph Structure

A graph consists of:

- Vertices
- Edges

Vertices represent nodes in the graph.  
Edges represent connections between vertices.

The graph in this project is undirected.

The adjacency list representation stores neighbors for each vertex.


---

# Class Descriptions

## Vertex Class

The Vertex class represents a graph node.

Fields:
- id

Methods:
- constructor
- getter
- toString()

---

## Edge Class

The Edge class represents a connection between two vertices.

Fields:
- source
- destination

Methods:
- constructor
- getters
- toString()

---

## Graph Class

The Graph class stores the graph using an adjacency list.

Methods:
- addVertex()
- addEdge()
- printGraph()
- bfs()
- dfs()

The class also handles graph traversal operations.


---

## Experiment Class

The Experiment class performs traversal tests and measures execution time using System.nanoTime().

Methods:
- runTraversals()
- runMultipleTests()
- printResults()

---

# BFS Algorithm

Breadth-First Search (BFS) explores the graph level by level.

The algorithm uses a Queue data structure.

Steps:
1. Start from a selected vertex
2. Mark the vertex as visited
3. Add neighbors to the queue
4. Repeat until the queue becomes empty

Use Cases:
- shortest path
- social networks
- navigation systems

Time Complexity:
O(V + E)

---

# DFS Algorithm

Depth-First Search (DFS) explores the graph deeply before backtracking.

The algorithm uses recursion (stack behavior).

Steps:
1. Start from a selected vertex
2. Visit the vertex
3. Recursively visit unvisited neighbors
4. Backtrack when needed

Use Cases:
- maze solving
- cycle detection
- topological sorting

Time Complexity:
O(V + E)

---

# Experimental Results

| Graph Size | BFS Time (ns) | DFS Time (ns) |
|------------|---------------|---------------|
| 10         | 203300        | 278900        |
| 30         | 876700        | 399000        |
| 100        | 4101300       | 2329200       |

---

# Analysis

As the graph size increases, execution time also increases.

Both BFS and DFS have time complexity O(V + E), which matches the experimental results.

DFS was faster in some experiments because recursion produced less overhead than queue operations.

The structure of the graph affects traversal order.  
In branching graphs, BFS and DFS produce different traversal paths.

BFS is preferred when the shortest path is required.

DFS limitations:
- may cause stack overflow
- does not guarantee shortest path


---

## Screenshots

### Graph Structure
![Graph Structure](docs/screenshots/graph-structure.png)

### BFS and DFS (Small Graph)
![BFS DFS](docs/screenshots/bfs-dfs-small.png)

### Performance Tests
![Performance](docs/screenshots/performance-tests.png)

---

# Reflection

This assignment helped me understand graph structures and traversal algorithms.

I learned the difference between BFS and DFS and how adjacency lists work.

One challenge was understanding traversal logic and recursion in DFS.

The experiments also showed how graph size affects algorithm performance.