#include <bits/stdc++.h>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Solution {
public:
    int buyMaximumProducts(int n, int k, int price[]){
        vector<pair<int,int>> v;
        for(int i=0;i<n;++i)
            v.push_back({price[i],i+1});
        sort(v.begin(),v.end());
        
        int out=0;
        
        for(auto i:v){
            int maxBuy=min(k/i.first,i.second);
            out+=maxBuy;
            k-=i.first*maxBuy;
        }
        return out;
    }
};

int main() {
    int price[] = {10, 7, 19};
    int k = 45;
    int n = sizeof(price) / sizeof(price[0]);
    
    Solution sol;
    cout << sol.buyMaximumProducts(n, k, price);
    return 0;
}

