#include <vector>
#include <iostream>
using namespace std;
struct Node {
	int data;
	struct Node *next;
	Node(int x) {
		data = x;
		next = NULL;
	}
};

class Solution
{
    public:
    Node* insertionSort(struct Node* head_ref)
    {
        
        vector<int> v;
        Node* temp=head_ref;
        while(temp!=NULL){
            v.push_back(temp->data);
            temp=temp->next;
        }
        sort(v.begin(),v.end());
         temp = head_ref;
    for (int val : v) {
        temp->data = val;
        temp = temp->next;
    }

    return head_ref;
    }
    
};

int main() {

    int N = 5;
    Node* head = new Node(30);
    Node* temp = head;
    int data;
    for (int i = 0; i < N-1; i++) {
        cin >> data;
        temp->next = new Node(data);
        temp = temp->next;
    }

   
    Solution solution;
    head = solution.insertionSort(head);

 
    temp = head;
    while (temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }
    return 0;
}