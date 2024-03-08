import java.util.*;
public class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        
         int[] remainderArray = new int[k];
        int maxLen = 0;
        int currentSum = 0;

        Arrays.fill(remainderArray, -1);

        for (int i = 0; i < n; i++) {
            currentSum += a[i];

            int remainder = (currentSum % k + k) % k;

            if (remainder == 0) {
                maxLen = i + 1;
            } else {
                if (remainderArray[remainder] == -1) {
                    remainderArray[remainder] = i;
                } else {
                    maxLen = Math.max(maxLen, i - remainderArray[remainder]);
                }
            }
        }

        return maxLen;
       
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 7, 6, 1, 4, 5};
        int N = 6;
        int K = 3;

        int output = solution.longSubarrWthSumDivByK(arr, N, K);
        System.out.println(output);
    }
 
}
