import java.util.Arrays;

public class Solution
{
    private boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int minNumber(int arr[], int N){
        int sum=Arrays.stream(arr).sum();
        if(isPrime(sum)){
            return 0;
        }
        
        int diff=0;
        while(!isPrime(sum+diff)){
            diff++;
        }
        return diff;
    }

    public static void main(String[] args) {
    
        int N = 5;
        int[] arr = {2, 4, 6, 8, 12};
        Solution sol = new Solution();
        System.out.println(sol.minNumber(arr, N)); 
    }
}
