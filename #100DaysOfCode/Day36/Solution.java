public class Solution{
    static int findWinner(int n, int A[]){
       
        int xor=0;
        for(int a:A)xor^=a;
        return (n%2!=0&&xor!=0)?2:1;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] A = {3, 3, 2};
        System.out.println(findWinner(n, A));
    }
}
