import java.util.*;
class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
       
        int count=0;
        for(int i=0;i<V;i++){
            count+=adj.get(i).size();
        }
        return count;
    }

    public static void main(String[] args) {
        int V = 4;
        int E = 4;
        int[][] edges = { { 0, 2 }, { 0, 3 }, { 1, 3 }, { 2, 3 } };

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }

        Solution solution = new Solution();
        int result = solution.sumOfDependencies(adj, V);
        System.out.println(result);
    }
}
