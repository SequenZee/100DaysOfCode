#include <vector>
#include <string>
#include <queue>
#include <iostream>
using namespace std;
class Solution{
public:
    int minValue(string s, int k){
       vector<int>mp(26);
        priority_queue<int>pq;
       for(int i=0;i<s.size();i++){
           mp[s[i]-'a']++;
       }
       for(int i=0;i<26;i++){
           if(mp[i]){
               pq.push(mp[i]);
           }
       }
       
       while(k){
           k--;
           int tp=pq.top();
           pq.pop();
           tp--;
           if(tp)
           pq.push(tp);
       }
       int ans=0;
       while(!pq.empty()){
           int t=pq.top();
           ans=ans+(t*t);
           pq.pop();
       }
       
       return ans;
    }
};

int main() {
    Solution solution;
    string s = "abccc";
    int k = 1;
    int result = solution.minValue(s, k);
    cout << result << endl; 
    return 0;
}