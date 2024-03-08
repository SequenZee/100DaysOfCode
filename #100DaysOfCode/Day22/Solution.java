public class Solution {
    int countX(int L, int R, int X) {
        // code here
        int count=0;
        for(int i=L+1;i<R;i++){
            int num=i;
            while(num!=0){
                if(num%10==X){
                    count+=1;
                }
                num=num/10;
            }       
        }
        return count;
    }
    public static void main(String[] args) {
        // Input
        int L = 10;
        int R = 19;
        int X = 1;
        Solution sol = new Solution();
        System.out.println(sol.countX(L, R, X)); 
    }
};
