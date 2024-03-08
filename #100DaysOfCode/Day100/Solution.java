public class Solution
{
    int  subsequenceCount(String s, String t)
    {
	
	  int prev[]=new int[t.length()+1];
       prev[0]=1;
       for(int i=1;i<=s.length();i++){
           int curr[]=new int[t.length()+1];
           curr[0]=1;
           for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    int take=prev[j-1]%1000000007;
                    int notTake=prev[j]%1000000007;
                    curr[j]=(take+notTake)%1000000007;
                }
                else{
                    curr[j]=prev[j]%1000000007;
                }
            }
            prev=curr;
        }
       return prev[t.length()]%1000000007;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "banana";
        String t = "ban";
        int result = solution.subsequenceCount(s, t);
        System.out.println(result);
    }
}
