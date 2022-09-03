package coding.dcp.ms;

/*
Microsoft 2019: Max Network Rank
Question:
N cities 1, 2, ... , N. M bidirectional roads between them. For each pair of cities connected by a road,
define their network rank as the total number of roads connected to either of the two cities.
Find the max network rank.
Signature:
int maxNetworkRank(int[] A, int[] B, int N) where N = # of cities and A, B are arrays of size M where
A[i], B[i] = cities at the ends of road i.
Solution:
Form a graph where the cities are the vertices and roads are the edges. Calculate the indegree function and
adjacency matrix, then find the max value of indegree(A) + indegree(B) - #roads-between-a-and-b.
*/
public class MaxNetworkRank {
    public static int solution(int[] A, int[] B, int N) {
        int maxRank = 0;
        int edgesLen = A.length;

        int[] edgesCount = new int[N + 1];

        for (int i = 0; i < edgesLen; i++) {
            edgesCount[A[i]] += 1;
            edgesCount[B[i]] += 1;
        }

        for (int i = 0; i < edgesLen; i++) {
            int localMax = edgesCount[A[i]] + edgesCount[B[i]] - 1;
            maxRank = Math.max(maxRank, localMax);
        }

        return maxRank;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 3};
        int[] B = {2, 3, 1, 4};
        int N = 4;

        System.out.println("expected " + 4 + " actual " + solution(A, B, N));
    }
}
