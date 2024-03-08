import java.util.*;
public class Solution
{   
    int M = (int) (1e9 + 7);

    int space = 0;
    int building = 1;
    
    public int TotalWays(int N) {
        int[][] t = new int[N + 1][2];
        for (int i = 0; i < N; i++) {
            Arrays.fill(t[i], -1);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == 0) {
                    t[i][j] = 1;
                } else {
                    if (j == building) {
                        t[i][j] = t[i - 1][space] % M;
                    } else {
                        t[i][j] = (t[i - 1][building] % M + t[i - 1][space] % M) % M;
                    }
                }
            }
        }

        long result = (t[N - 1][building] % M + t[N - 1][space] % M) % M;

        return (int) (result * result % M);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 1;
        int result = solution.TotalWays(N);
        System.out.println(result);
    }
}
