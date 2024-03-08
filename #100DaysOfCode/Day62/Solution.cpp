#include <vector>
#include <bits/stdc++.h>
#include <iostream>
using namespace std;
class Solution{
    public:
    int max_courses(int n, int total, vector<int> &cost)
    {
       
          vector<vector<int>> dp(total + 1, vector<int>(n + 1, -1));
        
        return solve(cost, n, total, 0, dp);
    }
    
    int solve(vector<int> &cost, int n,int total, int index, vector<vector<int>> &dp) {
        if(index == n) return 0;
    
        if(dp[total][index] != -1) return dp[total][index];
    
        int inc = 0, exc = 0;
   
        if(total - cost[index] >= 0) {
            inc = 1 + solve(cost, n, total - (cost[index]) + (cost[index])*0.9, index + 1, dp);
        }
      
        exc = solve(cost, n, total, index + 1, dp);
        
        dp[total][index] = max(inc, exc);
    
        return dp[total][index];
    }
};

int main() {
    int n, total;
    cin >> n >> total;

    vector<int> cost(n);
    for(int i = 0; i < n; i++) {
        cin >> cost[i];
    }

    Solution obj;
    int result = obj.max_courses(n, total, cost);

    cout<< result << endl;

    return 0;
}
