public class Solution{
    static long sequence(int n){
      
        long answer=0;
        int count=1,mod=1000000007;
        for(int i=1;i<=n;i++){
            long mul=1;
            for(int j=1;j<=i;j++){
                mul=(mul*(count++))%mod;
            }
            answer=(answer+mul)%mod;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 5;
        long output = sequence(n);
        System.out.println(output);
    }
}
