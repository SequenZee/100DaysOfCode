public class Solution
{
    private static final int MOD=1000000007;
    public int nthPoint(int n){
        if(n<=1){
            return 1;
        }
        int[] dp=new int[n+1];
        dp[0]=dp[1]=1;
        
        for(int i=2;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%MOD;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int N = 4;
        Solution sol = new Solution();
        System.out.println(sol.nthPoint(N));
    }
}
