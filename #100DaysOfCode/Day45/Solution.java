import java.util.*;
public class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
        // Your Code Here   
        if(n%k != 0) return 0;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i+k<=n; i+=k){
            String chunk = s.substring(i, i+k);
            map.put(chunk, map.getOrDefault(chunk, 0)+1);
        }
        int count = 0;
        for(String key : map.keySet()) {
            if(map.get(key) > 1) count++;
        }
        if(map.size() > 2) return 0;
        return count >= 2 ? 0 : 1;
    }

    public static void main(String[] args) {
        // Input
        int N = 4;
        int K = 2;
        String S = "bdac";
        
        // Output
        Solution sol = new Solution();
        System.out.println(sol.kSubstrConcat(N, S, K)); 
    }
}