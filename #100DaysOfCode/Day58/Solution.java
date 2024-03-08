import java.util.*;
class Solution {
    public String removeKdigits(String s, int k) {
        if(s.length()==k) return "0";
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            while(st.size()>0 && k>0 && ch<st.peek()){
                st.pop();
                k--;
            }
            
            if(st.isEmpty() && ch=='0') continue;
            else st.push(ch);
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        if(st.size()==0) return "0";
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            char ch = st.pop();
            sb.append(ch);
        }
        
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String S = "149811";
        int K = 3;
        String output = solution.removeKdigits(S, K);
        System.out.println(output);
    }
}