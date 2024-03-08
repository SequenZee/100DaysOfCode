import java.util.*;
class Solution
{
    int min_sprinklers(int gallery[], int n)
    {
        
       int arr[]=new int[n];
       Arrays.fill(arr,-1);
        for(int i=0;i<n;i++){
            if(gallery[i]!=-1){
           int a=Math.max(0,i-gallery[i]);
           int b=Math.min(n-1,i+gallery[i]);
            for(int j=a;j<=b;j++){
                arr[j]=Math.max(arr[j],b);
            }
            }
        }
     
        int c=0;
        for(int i=0; i<n; i++){
            if(arr[i]==-1)return -1;
            
            if(i<=arr[i]) c++;
             i=arr[i];
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int n = scanner.nextInt();

        int[] gallery = new int[n];
       
        for (int i = 0; i < n; i++) {
            gallery[i] = scanner.nextInt();
        }

        Solution obj = new Solution();
        int result = obj.min_sprinklers(gallery, n);

        System.out.println(result);
    }
}
