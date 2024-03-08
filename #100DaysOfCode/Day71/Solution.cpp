#include <vector>
#include <iostream>
#include <queue>
using namespace std;

class Solution {
  public:
  bool isCycle(int src, vector<int> &visited, vector<int> adj[]) {
        queue<pair<int,int>>q;
        q.push({src,-1});
        visited[src] = 1;
        
        while(!q.empty()) {
            int node = q.front().first;
            int parent = q.front().second;
            q.pop();
            for(auto i : adj[node]) {
                if(!visited[i]) {
                    visited[i] = 1;
                    q.push({i,node});
                } else if(parent != i){
                    return true;
                }
            }
        }
        
        return false;
    }
    int isTree(int n, int m, vector<vector<int>> &B) {
        if (n-1 != m) {
            return 0;
        } 
        
        vector<int>visited(n,0);
        vector<int> adj[n];
        for(int i=0; i<B.size(); i++) {
            vector<int>temp = B[i];
            adj[temp[0]].push_back(temp[1]);
            adj[temp[1]].push_back(temp[0]);
        }
        
        for(int i=0; i < n; i++) {
            if(visited[i] == 0) {
                if(isCycle(i,visited,adj)) {
                    return 0;
                }
            }
        }
        
        for(int i=0; i<n; i++) {
            if(visited[i] == 0) {
                return 0;
            }
        }
        
        return 1;
    }
};

int main() {
    int N = 4;
    int M = 3;
    vector<vector<int>> G = {{0, 1}, {1, 2}, {1, 3}};

    Solution sol;
    int output = sol.isTree(N, M, G);
    cout << output << endl;

    return 0;
}