import java.util.*;
public class Solution
{
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
       
        int len=s.length();
        boolean dp[]=new boolean[len+1];
        dp[0]=true;
        for(int i=0;i<=len;i++){
            for(int j=0;j<=i;j++){
                if(dp[j] && dictionary.contains(s.substring(j,i))) dp[i]=true;
            }
        }
        return dp[len]?1:0;
    }
    public static void main(String[] args) {
        int n = 6;
        String s = "ilike";
        ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile"));
        int result = wordBreak(n, s, dictionary);
        System.out.println(result); 
    }
}
