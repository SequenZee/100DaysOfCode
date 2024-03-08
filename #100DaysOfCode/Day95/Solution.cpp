#include <iostream>
using namespace std;
class Solution{
    public:
    public:
    bool isMaxHeap(int a[], int n) {
        for(int i = 0; i < n; i++) {
            if(2 * i + 1 < n && a[i] < a[2 * i + 1]) 
                return false;
            if(2 * i + 2 < n && a[i] < a[2 * i + 2]) 
                return false;
        }
        return true;
    }
};

int main() {
    int n = 6;
    int arr[] = {90, 15, 10, 7, 12, 2};

    Solution sol;
    bool isMax = sol.isMaxHeap(arr, n);

    cout << isMax << endl; 

    return 0;
}