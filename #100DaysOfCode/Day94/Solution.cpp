#include <bits/stdc++.h>
#include <iostream>
using namespace std;
class Node
{
public:
    int data;
    Node *left;
    Node *right;
    Node(int val)
    {
        data = val;
        left = NULL;
        right = NULL;
    }
};


class Solution
{
public:
    Node* last = NULL;
    Node* first = NULL;
    
    void traversal(Node* root)
    {
        if (root == NULL)
            return;
            
        Node* lefty = root -> left;
        Node* righty = root -> right;
        
        traversal(lefty);
        
        if (last == NULL)
        {
           first = root;
           root -> left = NULL;
           last = root;
        }
        else
        {
            last -> right = root;
            last = root;
            root -> left = NULL;
        }
        
        traversal(righty);
        
    }
    
    Node *flattenBST(Node *root)
    {
        // code here
        if (root == NULL or (root -> left == NULL and root -> right == NULL))
            return root;
        
        traversal(root);
        
        return first;
    }
};

int main() {
   
    Node *root = new Node(5);
    root->left = new Node(3);
    root->right = new Node(7);
    root->left->left = new Node(2);
    root->left->right = new Node(4);
    root->right->left = new Node(6);
    root->right->right = new Node(8);

   
    Solution sol;
    Node *flattened = sol.flattenBST(root);


    while (flattened != NULL) {
        cout << flattened->data << " ";
        flattened = flattened->right;
    }

    return 0;
}