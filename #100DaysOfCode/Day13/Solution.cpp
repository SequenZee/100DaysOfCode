#include <vector>
#include <iostream>
using namespace std;

class Solution
{
    public:
   vector<int> parent;
   vector<int> rank;
   
   int find(int x){
       if(parent[x] == x)
            return x;
        return parent[x]=find(parent[x]);
    
   }
   void Union(int x,int y){
       int x_parent=find(x);
       int y_parent=find(y);
       
       if(rank[x_parent]>rank[y_parent]){
           parent[y_parent]=x_parent;
       }else if(rank[x_parent]<rank[y_parent]){
           parent[x_parent]=y_parent;
       }else{
           parent[x_parent]=y_parent;
           rank[y_parent]++;
       }
   }
   int detectCycle(int V,vector<int>adj[]){
       parent.resize(V);
       rank.resize(V,0);
       
       for(int i=0;i<V;i++)
            parent[i]=i;
            
        for(int u=0;u<V;u++){
            for(int &v:adj[u]){
                if(u<v){
                    if(find(u)==find(v))
                        return true;
                    else{
                        Union(u,v);
                    }
                }
            }
        }
        return false;
   }
};

int main()
{
    int V = 5; 
    vector<int> adj[V]; 

    
    adj[1].push_back(3);
    adj[3].push_back(0);
    adj[0].push_back(4);
    adj[4].push_back(2);
    adj[2].push_back(0);

    Solution sol;
    if (sol.detectCycle(V, adj))
    {
        cout << "1" << endl;
    }
    else
    {
        cout << "0" << endl;
    }

    return 0;
}