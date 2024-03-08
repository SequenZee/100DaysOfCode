#include <iostream>
using namespace std;
class Solution
{
public:
    int minimumStep(int n)
    {

        int ans = 0;
        while (n != 1)
        {
            if (n % 3)
            {
                n--;
            }
            else
            {
                n /= 3;
            }
            ans++;
        }
        return ans;
    }
};
int main() {
    int n;
    cin >> n;
    Solution solution;
    int result = solution.minimumStep(n);
    cout << result << endl;
    return 0;
}