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

# Bonus Task — Dijkstra’s Algorithm

## Description

Dijkstra’s Algorithm is used to find the shortest path from a single starting vertex to all other vertices in a weighted graph.

In this project, the algorithm was implemented using an adjacency list representation of the graph.

---

## Algorithm Idea

The main idea of Dijkstra’s Algorithm is:

- Start from the source vertex
- Always choose the unvisited vertex with the smallest known distance
- Update the distances of its neighbors if a shorter path is found
- Repeat until all vertices are processed

---

## Steps

1. Initialize all distances as infinity
2. Set the starting vertex distance to 0
3. Mark all vertices as unvisited
4. Repeat:
    - Select the unvisited vertex with the smallest distance
    - Mark it as visited
    - Update distances to all adjacent vertices

---

## Implementation Notes

- The graph uses an adjacency list structure
- Edge weights are stored in the `Edge` class
- No priority queue (min-heap) was used
- A simple array-based implementation was used for learning purposes

---

## Time Complexity

- **O(V²)** — because the algorithm searches for the minimum distance vertex using a simple loop
- This implementation does not use a priority queue, which would reduce complexity to O((V + E) log V)

Where:
- V = number of vertices
- E = number of edges

---

## Experimental Results

| Graph Size | BFS Time (ns) | DFS Time (ns) |
|------------|---------------|---------------|
| 10         | 203300        | 278900        |
| 30         | 876700        | 399000        |
| 100        | 4101300       | 2329200       |

---

## Analysis

As the graph size increases, execution time also increases due to the growing number of vertices and edges.

Both BFS and DFS have a time complexity of O(V + E), which matches the experimental results.

DFS was sometimes faster due to lower overhead compared to queue-based BFS.

The structure of the graph affects traversal order and performance significantly.

---

## Output Example

```text
Shortest distances from vertex 0:

Vertex 0 → 0 = 0  
Vertex 0 → 1 = 4  
Vertex 0 → 2 = 3  
Vertex 0 → 3 = 6  
Vertex 0 → 4 = 5  