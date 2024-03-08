public class Solution{
    
    static long countSubarrays(int a[], int n, int L, int R)  
    { 
    
        int cnt=0;
        long rCnt=0;
        for(int i=0;i<n;i++){
            if(a[i]<=R){
                cnt++;
                rCnt+=cnt;
            }else{
                cnt=0;
            }
        }
        
        cnt=0;
        long lCnt=0;
        for(int i=0;i<n;i++){
            if(a[i]<L){
                cnt++;
                lCnt+=cnt;
                
            }else{
                cnt=0;
            }
        }
        return rCnt-lCnt;
    } 

    public static void main(String[] args) {
       
        int[] Arr = {2, 0, 11, 3, 0};
        int L = 1;
        int R = 10;

     
        System.out.println(countSubarrays(Arr, Arr.length, L, R)); 
    }
}
