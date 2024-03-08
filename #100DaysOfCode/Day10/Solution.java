import java.util.*;
public class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<Long> prev=new ArrayList<>();
        prev.add(1L);
        
        for(int i=1;i<n;i++){
            ArrayList<Long> next=new ArrayList<>();
            next.add(1L);
            
            for(int j=1;j<prev.size();j++){
                next.add((prev.get(j)+prev.get(j-1))%1000000007);
            }
            next.add(1L);
            prev=next;
        }
        return prev;
    }

    public static void main( String[] args ) {
        Solution solution = new Solution();
        int N = 4;
        ArrayList<Long> result = solution.nthRowOfPascalTriangle(N);
        for (Long num : result) {
            System.out.print(num + " ");
        }
    }
}
