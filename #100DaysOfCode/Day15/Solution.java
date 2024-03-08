import java.util.*;
public class Solution{
    public static int isEulerCircuit(int V, List<List<Integer>> adj) 
    {
        // code here
        int even=0;
        int odd=0;
        
        for(int i=0;i<V;i++){
            if(adj.get(i).size()%2==0) even++;
            else odd++;
        }
        if(even==V) return 2;
        if(odd>0 && odd==2) return 1;
        return 0;
    }

    public static void main(String[] args) {
      
        int V = 3; 
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(0);
        adj.get(0).add(2);
        

        int result = isEulerCircuit(V, adj);
        System.out.println(result);
    }
}
