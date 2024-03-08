public class Solution{
    static String matrixChainOrder(int p[], int n){
     
        int[][] m = new int[n][n];
        int[][] s = new int[n][n];

       
        for (int i = 1; i < n; i++) {
            m[i][i] = 0;
        }

        for (int L = 2; L < n; L++) {
            for (int i = 1; i < n - L + 1; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (cost < m[i][j]) {
                        m[i][j] = cost;
                        s[i][j] = k;
                    }
                }
            }
        }

    
        return printOptimalParens(s, 1, n - 1);
    }

    static String printOptimalParens(int[][] s, int i, int j) {
        if (i == j) {
            return String.valueOf((char)('A' + i - 1)); 
        } else {
            return "(" + printOptimalParens(s, i, s[i][j]) + printOptimalParens(s, s[i][j] + 1, j) + ")";
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[] p = {40, 20, 30, 10, 30};

        String output = matrixChainOrder(p, n);
        System.out.println(output.equals("((A(BC))D)"));
    }
}
