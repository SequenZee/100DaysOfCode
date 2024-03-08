#include <vector>
#include <set>
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Node
{
	int data;
	Node *left, *right;
};

class Solution
{
public:
    set<Node *> ans;
    void solve(Node *root, int lvl, vector<Node *> v, int k) {
        if(!root)
            return;
            
        v.push_back(root);
        if(!root->left and !root->right) 
        {
            int ind = lvl - k;
            if(ind >= 0)
                ans.insert(v[ind]);
                
            return;
        }
        
        solve(root->left, lvl + 1, v, k);
        solve(root->right, lvl + 1, v, k);
    }
    
    int printKDistantfromLeaf(Node* root, int k)
    {
        ans.clear();
        vector<Node *> v;
        solve(root, 0, v, k);
        return ans.size();
    }
};

int main() {
    Node* root = new Node();
    root->data = 1;
    root->left = new Node();
    root->left->data = 2;
    root->right = new Node();
    root->right->data = 3;
    root->left->left = new Node();
    root->left->left->data = 4;
    root->left->right = new Node();
    root->left->right->data = 5;
    root->right->left = new Node();
    root->right->left->data = 6;
    root->right->right = new Node();
    root->right->right->data = 7;
    root->right->left->right = new Node();
    root->right->left->right->data = 8;

    int k = 2;

    Solution sol;
    int output = sol.printKDistantfromLeaf(root, k);
    cout<< output << endl;

    return 0;
}