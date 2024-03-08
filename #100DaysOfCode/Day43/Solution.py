class Solution:
    def antiDiagonalPattern(self,matrix):
        # Code here
        n=len(matrix)
        m=len(matrix[0])
        col=0
        row=0
        solution=[]
        while col<m and row<n:
            i=col
            j=row
            while i>=0 and j<n:
                solution.append(matrix[j][i])
                i-=1
                j+=1
            if col<m-1:
                col+=1
            else:
                row+=1
        return solution
def main():
    N = 2
    matrix = [[1, 2], [3, 4]]
    sol = Solution()
    print(sol.antiDiagonalPattern(matrix))  # Output:

if __name__ == "__main__":
    main()

