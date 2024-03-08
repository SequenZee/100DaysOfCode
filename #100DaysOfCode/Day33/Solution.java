public class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        if(n==1) return arr[0];
        int csm=arr[0];
        int tsm=0;
        
        for(int i=1;i<n;i++){
            int t=csm;
            csm=tsm+arr[i];
            tsm=Math.max(t,tsm);
        }
        return Math.max(csm,tsm);
    }

    public static void main(String[] args) {
        int N = 6;
        int[] Arr = {5, 5, 10, 100, 10, 5};
        Solution sol = new Solution();
        System.out.println(sol.findMaxSum(Arr, N));
    }
}
