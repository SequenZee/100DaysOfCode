import java.util.*;
public class Solution {
    static int minCandy(int N, int ratings[]) {
        // code here
        int[] candies=new int[N];
        Arrays.fill(candies,1);
        
        for(int i=1;i<N;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int i=N-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        int cnt=0;
        for(int candy:candies){
            cnt+=candy;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int N = 3;
        int[] ratings = {1, 0, 2};
        System.out.println(minCandy(N, ratings));
    }
}
