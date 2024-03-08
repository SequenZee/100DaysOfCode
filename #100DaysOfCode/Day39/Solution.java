import java.util.*;
import java.util.HashMap;
public class Solution 
{
    
    public int countOccurence(int[] arr, int n, int k) 
    {
       
        
        int count=n/k;
        int freq=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            int e=arr[i];
            map.put(e,map.getOrDefault(e,0)+1);
            
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>count){
                freq++;
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        int N = 8;
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int k = 4;
        Solution sol = new Solution();
        System.out.println(sol.countOccurence(arr, N, k));
    }
}
