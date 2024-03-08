#include <bits/stdc++.h>
#include <unordered_set>
#include <iostream>
using namespace std;

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};


class Solution
{
public:
    void add(Node *root, unordered_set<int> &s){
        if(root==NULL) return;
        add(root->left, s);
        s.insert(root->data);
        add(root->right, s);
    }
    int countPairs(Node* root1, Node* root2, int x)
    {
        unordered_set<int> s1,s2;
        add(root1,s1);
        add(root2,s2);
        int ans=0;
        
        for(auto &i:s1) if(s2.count(x-i)) ans++;
        return ans;
    }
};

int main() {
    // Constructing BST1
    Node* root1 = new Node(5);
    root1->left = new Node(3);
    root1->right = new Node(7);
    root1->left->left = new Node(2);
    root1->left->right = new Node(4);
    root1->right->left = new Node(6);
    root1->right->right = new Node(8);
    
    // Constructing BST2
    Node* root2 = new Node(10);
    root2->left = new Node(6);
    root2->right = new Node(15);
    root2->left->left = new Node(3);
    root2->left->right = new Node(8);
    root2->right->left = new Node(11);
    root2->right->right = new Node(18);
    
    // Define the value of x
    int x = 16;
    
    Solution obj;
    cout << obj.countPairs(root1, root2, x) << endl;
    
    // Deallocate memory
    delete root1->left->left;
    delete root1->left->right;
    delete root1->right->left;
    delete root1->right->right;
    delete root1->left;
    delete root1->right;
    delete root1;
    
    delete root2->left->left;
    delete root2->left->right;
    delete root2->right->left;
    delete root2->right->right;
    delete root2->left;
    delete root2->right;
    delete root2;
    
    return 0;
}