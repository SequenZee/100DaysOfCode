public class Solution
{
    long countWays(int n,int k)
    {
        //code here.
        if(n==1)
            return k;
        long mod=(long) 1e9+7,same=0,diff=k;
        
        for(int i=2;i<=n;i++){
            long prev=same;
            same=diff;
            diff=((prev+same)*(k-1))%mod;
        }
        return (same+diff)%mod;
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        Solution sol = new Solution();
        System.out.println(sol.countWays(n, k));
    }
}

