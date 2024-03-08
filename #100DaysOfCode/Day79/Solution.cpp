#include <vector>
#include <unordered_map>
#include <string>
#include <iostream>
using namespace std;


class Solution
{
  public:
   
    bool checkPangram (string s) {
      
           unordered_map<char, int> mp;
        int t = 97;

        for (int i = 0; i < 26; i++) {
            char temp = 'a' + (t - 'a');
            mp[temp]++;
            t++;
        }

        for (auto i : s) {
            if (i >= 'a' && i <= 'z')
                mp[i]++;
            if (i >= 'A' && i <= 'Z') {
                char temp = tolower(i);
                mp[temp]++;
            }
        }

        for (auto i : mp) {
            if (i.second <= 1)
                return 0;
        }
        return 1;
    }

};

int main() {
    string s = "Bawds jog, flick quartz, vex nymph";
    Solution sol;
    bool output = sol.checkPangram(s);
    cout << (output ? 1 : 0) << endl;
    return 0;
}