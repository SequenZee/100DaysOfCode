public class Solution {
    public int smallestSubstring(String S) {
        // Code here
          int k = 2;   // This variable represents len of substring that we are trying to find.
        
        while(k++ < S.length()) {
            
            for(int i=0; i<=S.length() - k; i++) {
                if((S.substring(i,i+k).contains("0")) && (S.substring(i,i+k).contains("1")) 
                    && (S.substring(i,i+k).contains("2")))
                    
                    return k;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String S = "10212";
        int result = solution.smallestSubstring(S);
        System.out.println(result);
    }
};
