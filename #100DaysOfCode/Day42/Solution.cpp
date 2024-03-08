#include <vector>
#include <unordered_map>
#include <bits/stdc++.h>
#include <iostream>
using namespace std;

class Solution{
  public:
  vector<vector<int>> sumZeroMatrix(vector<vector<int>> a){
      //Code Here
      int n=a.size(),m=a[0].size();
      int area=0,x1=-1,x2=-1,y1=-1,y2=-1;
      for(int l=0;l<m;l++){
          vector<int>arr(n);
          for(int r=l;r<m;r++){
              for(int i=0;i<n;i++){
                  arr[i]+=a[i][r];
                  
              }
              unordered_map<int,int>mp;mp[0]=-1;
              int sum=0,len=0,s=-1,e=-1; 
              for(int i=0;i<n;i++){
                  sum+=arr[i];
                  if(mp.find(sum)!=mp.end()){
                      if(len<i-mp[sum]){
                          len=i-mp[sum];
                          e=i;
                          s=mp[sum]+1;
                          
                        }
                    }
                    else mp[sum]=i;
              }
              if(area<len*(r-l+1)){
                  area=len*(r-l+1);
                  y1=l;y2=r;
                  x1=s;x2=e;
                }
            }
        }
        
        vector<vector<int>> ans;
        if(x1==-1||x2==-1||y1==-1||y2==-1) return ans;
        for(int i=x1;i<=x2;i++){
            vector<int>temp;
            for(int j=y1;j<=y2;j++){
                temp.push_back(a[i][j]);
            }
            ans.push_back(temp);
        }
        return ans;  
  }
};

int main() {
    int N = 3, M = 3;
    vector<vector<int>> mat = {{1, 2, 3}, {-3, -2, -1}, {1, 7, 5}};
    
    Solution sol;
    vector<vector<int>> result = sol.sumZeroMatrix(mat);
    
    // Output
    for(const auto& row : result) {
        for(int elem : row) {
            cout << elem << " ";
        }
        cout << endl;
    }
    
    return 0;
}
