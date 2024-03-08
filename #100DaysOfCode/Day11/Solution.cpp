#include <bits/stdc++.h>
#include <iostream>
#include <vector>
using namespace std;

class Solution{
	public:
	void shuffleArray(int arr[],int n)
	{
	    vector<int>v;
	    int mid=n/2;
	    for(int i=0;i<n/2;i++){
	        v.push_back(arr[i]);
	        v.push_back(arr[mid++]);
	    }
	    for(int i=0;i<n;i++)
	        arr[i]=v[i];
	}	
};

int main() {
    int n = 4;
    int arr[] = {1, 2, 9, 15};
    Solution sol;
    sol.shuffleArray(arr, n);
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}

