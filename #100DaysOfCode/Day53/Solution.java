public class Solution {
    public static long sumOfPowers(long a, long b) {
        long sum = 0;
        for(long i = a; i<=b; i++){
            sum+=findPrime(i, 0);
        }
        return sum;
    }

    public static long findPrime(long a, long temp){
        long i = 2;
        while (i*i<=a && a>1) {
            if(a%i==0){
                a=a/i;
                temp++;
            }
            if(a%i!=0){
                i++;
            }
        }
        if(a!=1){
            temp++;
        }
        return temp;
    }
    public static void main(String[] args) {
        long a = 9;
        long b = 12;
        long result = sumOfPowers(a, b);
        System.out.println(result);
    }
}
        
