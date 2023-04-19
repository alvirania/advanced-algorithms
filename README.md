# advanced-algorithms
Labs for CPS688 - Advanced Algorithms

LAB 1: 

Uses java to implement a Graph using an adjacency list.
Given an undirected graph, you are required to create its corresponding adjacency list using the
Graph implementation above and print its vertices using Breadth First Search [ BFS ] and Depth
First Search [ DFS ].

LAB 2: 

Problem 1 – N-Queens
The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two
queens attack each other.
The idea is to place queens one by one in different columns, starting from the leftmost column.
When placing a queen in a column, you should check for clashes with already placed queens (no
more than one Q in the row and column).

Problem 2 – Acyclic Graph
Given an undirected graph, you are required to check if the graph has a cycle.

Problem 3 – Minimum Spanning Tree
Given a weighted undirected graph, you are required to find the minimum spanning tree in the
graph using Prim’s algorithm.


LAB 3:

Problem 1 – Rod Cutting Problem:
Given a rod of steel, you need to cut it into pieces in a way to optimize the total revenue. The
decision is where to cut the rod given that different piece lengths have different revenue.
Given a rod of length n inches and a table of prices p[i], i=1,2,...,n, find the maximum revenue
r[n] obtainable by cutting up the rod and selling the pieces.

Problem 2 – Strongly Connected Components
Given a directed graph, write a program that checks if the given graph is strongly connected
or not. A directed graph is said to be strongly connected if every vertex is reachable from
every other vertex.
Following is Kosaraju’s DFS-based solution that does two DFS traversals of graph:
1. Initialize all vertices as not visited.
2. Do a DFS traversal of graph starting from any arbitrary vertex v. If DFS traversal doesn’t
visit all vertices, then return false.
3. Reverse all arcs (or find transpose or reverse of graph)
4. Mark all vertices as not-visited in reversed graph.
5. Do a DFS traversal of reversed graph starting from same vertex v (Same as step 2). If
DFS traversal doesn’t visit all vertices, then return false. Otherwise return true.


Lab 5:

Problem 1 – Boyer-Moore Substring Search
Implement the Boyer-Moore substring search algorithm in Java

Problem 2 – Rabin-Karp Substring Search
Implement the Rabin-Karp substring search algorithm in Java (Las Vegas version, see lecture
notes for details). Test your program as you did in Problem 1.
