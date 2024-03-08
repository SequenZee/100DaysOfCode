public class Solution {
    static int gameOfXor(int N , int[] A) {
        // code here
        if(N%2==0) return 0;
        int ans=0;
        for(int i=0;i<N;i++) if(i%2==0) ans^=A[i];
        return ans;
    }
    public static void main(String[] args) {
        int N = 3;
        int[] A = {1, 2, 3};
        System.out.println(gameOfXor(N, A));
    }
};
