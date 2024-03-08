#include <vector>
#include <iostream>
using namespace std;
class Solution {
public:
 
    void dfs(int node , int parent , vector<int>&low ,vector<int>&tin , vector<int>&vis , vector<int> adj[] , int &timer,  vector<vector<int>> & bridges ){
        vis[node] = 1;
        low[node] = timer;
        tin[node] = timer;
        timer++;
        for(auto nbr : adj[node]){
            if(nbr == parent) continue;
            else if(!vis[nbr]){
                dfs(nbr,node , low , tin , vis , adj , timer , bridges);
                low[node] = min(low[node] , low[nbr]);
                if(low[nbr] > tin[node]){
                    if(nbr> node) bridges.push_back({node,nbr});
                    else bridges.push_back({nbr,node});
                }
            }
            else{
                low[node] = min(low[node] , low[nbr]);
            }
        }
    }
 
vector<vector<int>>criticalConnections(int v, vector<int> adj[]){
   
    vector<vector<int>> bridges;
    vector<int> low(v,0);
    vector<int> tin(v,0);
    vector<int> vis(v,0);
    int parent = -1;
    int timer = 0;
    dfs(0 , parent , low , tin , vis , adj , timer , bridges);
    sort(bridges.begin() , bridges.end());
    return bridges;   
}
};

int main() {
   
    int v = 3;
    vector<int> adj[v];
    adj[0].push_back(1);
    adj[1].push_back(0);
    adj[0].push_back(2);
    adj[2].push_back(0);

    Solution sol;

   
    vector<vector<int>> bridges = sol.criticalConnections(v, adj);

    for (auto bridge : bridges) {
        cout << bridge[0] << " " << bridge[1] << endl;
    }

    return 0;
}
