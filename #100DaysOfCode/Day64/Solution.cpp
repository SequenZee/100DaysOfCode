#include <vector>
#include <bits/stdc++.h>
#include <iostream>
using namespace std;

class Solution
{
public:
    vector<vector<int>> uniquePerms(vector<int> &arr, int n)
    {
        vector<vector<int>> result;
        vector<int> current;
        vector<bool> used(n, false);
        sort(arr.begin(), arr.end());
        backtrack(arr, n, current, used, result);

        return result;
    }

private:
    void backtrack(vector<int> &arr, int n, vector<int> &current, vector<bool> &used, vector<vector<int>> &result)
    {
        if (current.size() == n)
        {
            result.push_back(current);
            return;
        }

        for (int i = 0; i < n; ++i)
        {
            if (used[i] || (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]))
            {
                continue;
            }

            current.push_back(arr[i]);
            used[i] = true;

            backtrack(arr, n, current, used, result);

            current.pop_back();
            used[i] = false;
        }
    }
};
int main()
{
    int n;
    cin >> n;

    vector<int> arr(n);
    for (int i = 0; i < n; ++i)
    {
        cin >> arr[i];
    }

    Solution obj;
    vector<vector<int>> result = obj.uniquePerms(arr, n);

    for (auto &vec : result)
    {
        for (int &num : vec)
        {
            cout << num << " ";
        }
        cout << endl;
    }

    return 0;
}