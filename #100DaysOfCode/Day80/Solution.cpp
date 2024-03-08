#include <vector>
#include <unordered_set>
#include <string>
#include <iostream>
using namespace std;

class Solution{
  public:
    /*You are required to complete this method */
    int atoi(string s) {
        //Your code here
         unordered_set<char>num = {'0','1','2','3','4','5','6','7','8','9'};
       char sign = s[0];
       int startIndex;
       if(sign == '-'){
           startIndex = 1;
       }else{
           startIndex = 0;
       }
       int ans = 0;
       for(;startIndex < s.length();startIndex++){
           if(num.find(s[startIndex])==num.end()){
               return -1;
           }
           ans = ans * 10 + s[startIndex] - '0';
       }
       if(sign == '-') ans *= -1;
       return ans;
    }
};

int main() {
    string s = "-123";
    Solution sol;
    int output = sol.atoi(s);
    cout << output << endl;
    return 0;
}