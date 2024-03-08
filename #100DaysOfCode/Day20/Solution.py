class Solution:
    def isSumString (ob,s):
      
        n=len(s)
        def check(i,j,k):
            nonlocal s,n
            if k==n:
                return True
            if k>n:
                return False
            n1=int(s[i:j])
            n2=int(s[j:k])
            ns=str(n1+n2)
            if not s[k:].startswith(ns):
                return False
            return check(j,k,k+len(ns))
            
        for i in range(1,n):
            for j in range(i+1,n):
                if check(0,i,j):
                    return 1
        return 0

def main():
    
    test_cases = ["12243660"]
    sol = Solution()
    for i, test_case in enumerate(test_cases, start=1):
        result = sol.isSumString(test_case)
        print(f"{result}")

if __name__ == "__main__":
    main()

