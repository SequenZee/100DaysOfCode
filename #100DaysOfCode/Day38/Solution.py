from typing import List
class Solution:
    def maxMeetings(self, N : int, S : List[int], F : List[int]) -> List[int]:
        # code here
        l,ans,lastF=[],[],-1
        for i in range(1,N+1): l.append([S[i-1],F[i-1],i])
        l.sort(key=lambda x:x[1])
        for a in l:
            if a[0]>lastF:
                lastF=a[1]
                ans.append(a[2])
        ans.sort()
        return ans
if __name__ == "__main__":
    N = 6
    S = [1, 3, 0, 5, 8, 5]
    F = [2, 4, 6, 7, 9, 9]
    sol = Solution()
    print(sol.maxMeetings(N, S, F))