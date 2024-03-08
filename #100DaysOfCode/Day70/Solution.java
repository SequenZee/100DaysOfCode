import java.util.*;
public class Solution
{
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        // add your code here
         int[] inDegree = new int[n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (ArrayList<Integer> prerequisite : prerequisites) {
            int u = prerequisite.get(0);
            int v = prerequisite.get(1);
            
            inDegree[v]++;
            graph.get(u).add(v);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            result.add(u);
            index++;
            
            for (int v : graph.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    queue.add(v);
                }
            }
        }
        
        if (index == n) {
            int[] order = new int[n];
            for (int i = 0; i < n; i++) {
                order[i] = result.get(i);
            }
            return order;
        } else {
            return new int[0];
        }
    }
    public static void main(String[] args) {
        int n = 2;
        int m = 1;
        ArrayList<ArrayList<Integer>> prerequisites = new ArrayList<>();
        ArrayList<Integer> prerequisite1 = new ArrayList<>();
        prerequisite1.add(1);
        prerequisite1.add(0);
        prerequisites.add(prerequisite1);

        int[] order = findOrder(n, m, prerequisites);
        System.out.println(order[0]);
    }
}
