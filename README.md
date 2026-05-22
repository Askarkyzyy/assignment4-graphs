# Assignment 4 – Graph Traversal and Representation System

## Project Overview

This project demonstrates graph representation and traversal algorithms in Java.

The graph is implemented using an adjacency list structure.  
Each graph contains vertices (nodes) and edges (connections between nodes).

The project includes three main algorithms:

- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Dijkstra’s Algorithm (Bonus Task)

The program also measures execution time for graph traversal experiments.

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

Represents a graph node.

Fields:
- id

Methods:
- constructor
- getter
- toString()

---

## Edge Class

Represents a connection between two vertices.

Fields:
- source
- destination
- weight (for Dijkstra bonus task)

Methods:
- constructor
- getters
- toString()

---

## Graph Class

Stores the graph using an adjacency list.

Methods:
- addVertex()
- addEdge()
- printGraph()
- bfs()
- dfs()
- dijkstra(int start)

The class handles graph traversal and shortest path computation.

---

## Experiment Class

Performs traversal tests and measures execution time using System.nanoTime().

Methods:
- runTraversals()
- runMultipleTests()
- printResults()

---

# BFS Algorithm

Breadth-First Search explores the graph level by level.

Uses a Queue data structure.

Steps:
1. Start from a selected vertex
2. Mark as visited
3. Visit neighbors level by level
4. Continue until queue is empty

Time Complexity:
O(V + E)

Use Cases:
- shortest path in unweighted graphs
- social networks
- routing systems

---

# DFS Algorithm

Depth-First Search explores the graph deeply before backtracking.

Uses recursion (stack behavior).

Steps:
1. Start from a vertex
2. Visit node
3. Recursively visit neighbors
4. Backtrack when needed

Time Complexity:
O(V + E)

Use Cases:
- cycle detection
- maze solving
- topological sorting

---

# Dijkstra’s Algorithm (Bonus Task)

Finds the shortest path from a starting vertex to all other vertices in a weighted graph.

Steps:
1. Start from source vertex
2. Pick the unvisited vertex with smallest distance
3. Update distances to neighbors
4. Repeat until all vertices are processed

Time Complexity:
- O(V²) using arrays and simple loops
- No priority queue (min-heap) used

---

# Experimental Results

| Graph Size | BFS Time (ns) | DFS Time (ns) |
|------------|---------------|---------------|
| 10         | 203300        | 278900        |
| 30         | 876700        | 399000        |
| 100        | 4101300       | 2329200       |

---

# Analysis

As graph size increases, execution time also increases.

Both BFS and DFS follow O(V + E) complexity.

DFS was sometimes faster due to lower overhead of recursion compared to queue operations.

Graph structure affects traversal order and performance.

---

# Dijkstra Output Example

```text
Shortest distances from vertex 0:
0 -> 0 = 0
0 -> 1 = 4
0 -> 2 = 3
0 -> 3 = 6
0 -> 4 = 5