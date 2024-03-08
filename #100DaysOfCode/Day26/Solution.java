import java.util.*;
public class Solution{
    
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashSet<Integer> s=new HashSet<>();
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(sum==0||arr[i]==0) return true;
            
            if(s.contains(sum)) return true;
            else s.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {4, 2, -3, 1, 6};
        
        if (findsum(arr, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
