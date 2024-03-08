public class Solution {
    int numberSequen(int m, int n) {
        if (m == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        int pick = numberSequen(m - 1, n / 2);
        int notpick = numberSequen(m, n - 1);
        return pick + notpick;
    }

    int numberSequence(int m, int n) {
        return numberSequen(n, m);
    }

    public static void main(String[] args) {
        int m = 10;
        int n = 4;

        Solution obj = new Solution();
        int result = obj.numberSequence(m, n);

        System.out.println(result);
    }

}