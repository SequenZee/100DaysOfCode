import java.util.*;
public class Solution{
    List<Integer>print(List<Integer>ans1,int n,int s){
        ans1.add(n);
        if(n==ans1.get(0))return ans1;
        if(n<=0)s=1;
        if(s==1)return print(ans1,n+5,1);
        else return print(ans1,n-5,0);
        
    }
    public List<Integer> pattern(int N){
        List<Integer>ans=new ArrayList<>();
        ans.add(N);
        if(N<=0)return ans;
        return print(ans,N-5,0);
    }

    public static void main(String[] args) {
        int N = 16;
        Solution sol = new Solution();
        List<Integer> result = sol.pattern(N);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}