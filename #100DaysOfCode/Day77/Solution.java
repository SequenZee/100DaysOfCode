public class Solution 
{ 
    int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        // code here
         int[][][] dp = new int[n1+1][n2+1][n3+1];
        for (int i = 0; i <= n1; i++) {
        for (int j = 0; j <= n2; j++) {
        for (int k = 0; k <= n3; k++) {
            dp[i][j][k] = -1;
        }
    }
}
      return Helper(A,B,C,n1,n2,n3,0,0,0,dp);
       
       
        
    }
    int Helper(String A,String B,String C,int n1,int n2,int n3,int i,int j,int k,int[][][]dp){
        
        if(i > n1-1 || j > n2-1 || k > n3-1) return 0;
        
        if(dp[i][j][k] != -1) return dp[i][j][k];
        
        if(A.charAt(i) == B.charAt(j) && B.charAt(j) == C.charAt(k)){
            dp[i][j][k] = 1 + Helper(A,B,C,n1,n2,n3,i+1,j+1,k+1,dp);
        }else{
            dp[i][j][k] = Math.max(Helper(A,B,C,n1,n2,n3,i+1,j,k,dp),
            Math.max(Helper(A,B,C,n1,n2,n3,i,j+1,k,dp),
            Helper(A,B,C,n1,n2,n3,i,j,k+1,dp)));
        }
        return dp[i][j][k];
        
    }
    public static void main(String[] args) {
        String A = "geeks";
        String B = "geeksfor";
        String C = "geeksforgeeks";
        int n1 = A.length();
        int n2 = B.length();
        int n3 = C.length();

        Solution sol = new Solution();
        int output = sol.LCSof3(A, B, C, n1, n2, n3);
        System.out.println(output);
    }
}
