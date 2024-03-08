class Solution:
    def determinantOfMatrix(self,matrix,n):
        # code here 
        def compute(row,col_s):
            nonlocal n
            if row==n:
                return 1
            sign=1
            ret=0
            for c in range(n):
                if c not in col_s:
                    col_s.add(c)
                    ret+=sign*matrix[row][c]*compute(row+1,col_s)
                    col_s.remove(c)
                    sign*=-1
            return ret
        return compute(0,set())
if __name__ == "__main__":
    n = 4
    matrix = [[1, 0, 2, -1],
              [3, 0, 0, 5],
              [2, 1, 4, -3],
              [1, 0, 5, 0]]
    sol = Solution()
    print(sol.determinantOfMatrix(matrix, n))