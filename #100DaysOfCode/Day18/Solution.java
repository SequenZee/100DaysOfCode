class Solution
{
    static int isRepresentingBST(int arr[], int N)
    {
        // code here
        for(int i=1;i<N;i++){
            if(arr[i]<arr[i-1]){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int N = 3;
        int[] arr = {2, 4, 5};
        int result = isRepresentingBST(arr, N);
        System.out.println(result);
    }
}
