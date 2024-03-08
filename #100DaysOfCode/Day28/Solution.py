class Solution:
    def maxGold(self, n, m, M):
        # code here
        for j in range(m-1,-1,-1):
            for i in range(0,n):
                if j<m-1:
                    x=M[i][j]
                    M[i][j]=M[i][j]+M[i][j+1]
                    if i+1<n:
                        M[i][j]=max(M[i][j],x+M[i+1][j+1])
                    if i-1>=0:
                        M[i][j]=max(M[i][j],x+M[i-1][j+1])
        ans=0
        for i in range(0,n):
            ans=max(ans,M[i][0])
        return ans
    
    def main(self):
        n = 3
        m = 3
        M = [[1, 3, 3],
             [2, 1, 4],
             [0, 6, 4]]
        print(self.maxGold(n, m, M))


if __name__ == "__main__":
    sol = Solution()
    sol.main()
