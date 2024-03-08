#include <vector>
#include <iostream>
using namespace std;
class Solution{
    public:
        int vertexCover(int n, vector<pair<int, int>> &edges) {
                // code here
                 int ans=n;
                for(int mask=0;mask<(1<<n);mask++){
                    bool ok=true;
                    for(auto &it:edges){
                        int u=it.first,v=it.second;
                        u--;v--;
                        if(!(mask&(1<<u)) and !(mask&(1<<v))){
                            ok=false;break;
                        }
                    }
                    if(ok)ans=min(ans,__builtin_popcount(mask));
                }
                return ans;
            }
};

int main() {
    int N = 5, M = 6;
    vector<pair<int, int>> edges = {{1,2}, {4, 1}, {2, 4}, {3, 4}, {5, 2}, {1, 3}};

    Solution obj;
    int result = obj.vertexCover(N, edges);

    cout << result << endl;

    return 0;
}