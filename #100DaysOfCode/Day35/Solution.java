public class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here    
        int res=m^n;
        int cnt=0;
        while(res>0){
            if((res&1)!=0){
                return cnt+1;
            }
            
            res=res>>1;
            cnt++;
            
        }
        return -1;
            
    }

    public static void main(String[] args) {
        int M = 11, N = 9;
        System.out.println(posOfRightMostDiffBit(M, N));
    }
}
