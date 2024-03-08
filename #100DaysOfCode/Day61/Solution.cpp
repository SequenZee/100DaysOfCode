#include <vector> 
#include <iostream>
#include <set>
#include <bits/stdc++.h>
using namespace std;
class Solution
{   
    public:
    vector<int> repeatedRows(vector<vector<int>> &matrix, int M, int N) 
    { 
        // Your code here
        set<int>res;
        for(int i=0;i<M-1;i++)
        {
            for(int j=i+1;j<M;j++)
            {
                if(matrix[i]==matrix[j])
                    res.insert(j);
            }
        }
        
        vector<int>ans;
        for(auto i : res)
        {
            ans.push_back(i);
        }
        
        return ans;
      
    } 
};

int main() {
    int R, C;
   
    cin >> R >> C;
    
    vector<vector<int>> matrix(R, vector<int>(C));
  
    for(int i = 0; i < R; i++) {
        for(int j = 0; j < C; j++) {
            cin >> matrix[i][j];
        }
    }
    
    Solution obj;
    vector<int> result = obj.repeatedRows(matrix, R, C);
    

    for(int i = 0; i < result.size(); i++) {
        cout << result[i] << " ";
    }
    cout << endl;
    
    return 0;
}