#include <bits/stdc++.h>
#include <iostream>
using namespace std;

const long long unsigned int MOD = 1000000007;
struct Node
{
    bool data;  
    Node* next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
    
}; 
class Solution
{
    public:

        long long unsigned int decimalValue(Node *head)
        {
         
            long long unsigned int d = 0;

        Node *ptr = head;
         
        while (ptr != NULL)
        {
        
            d = (d << 1) + ptr->data;
            d = d % MOD;

            ptr = ptr->next;
        }

        return d;
        }
};

int main() {
    Node *head = new Node(0);
    head->next = new Node(1);
    head->next->next = new Node(1);

    Solution sol;
    long long unsigned int output = sol.decimalValue(head);
    cout << output << endl;

  
    while (head) {
        Node *temp = head;
        head = head->next;
        delete temp;
    }

    return 0;
}

