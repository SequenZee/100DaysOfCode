import java.util.*;
public class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long sum=0,res=0;
        int i=0,j=0;
        while(j!=K){
            sum+=Arr.get(j++);
        }
        res=sum;
        while(j!=N){
            sum=sum+Arr.get(j++);
            sum=sum-Arr.get(i++);
            
            res=Math.max(res,sum);
        }
        
        return res;
    }

    public static void main(String[] args) {
        int N = 4;
        int K = 2;
        ArrayList<Integer> Arr = new ArrayList<>(Arrays.asList(100, 200, 300, 400));
        System.out.println(maximumSumSubarray(K, Arr, N));
    }
}
