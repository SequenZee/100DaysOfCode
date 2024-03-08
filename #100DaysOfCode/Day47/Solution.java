public class Solution {
    public static boolean isPossible(int N, int[] coins) {
        // code here
        return helper(coins,0,N);
    }
    static boolean helper(int[] arr, int sum, int N){
        if(sum != 0 && (sum % 20 == 0 || sum % 24 == 0 || sum % 2024 == 0)){
            return true;
        }
        if(N == 0){
            return false;
        }
        return helper(arr,sum+arr[N-1],N-1) || helper(arr,sum,N-1);
    }

    public static void main(String[] args) {
        int N = 8;
        int[] coins = {5, 8, 9, 10, 14, 2, 3, 5};
        boolean result = isPossible(N, coins);
        System.out.println(result ? 1 : 0);
    }
}
        
