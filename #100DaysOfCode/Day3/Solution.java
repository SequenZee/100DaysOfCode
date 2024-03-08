class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class Solution
{ 
    Node head=null,prev=null;
     void inorder(Node root){
         if(root!=null){
             inorder(root.left);
             if(head==null){
                 head=root;
             }
             if(prev!=null){
                 prev.right=root;
             }
             root.left=prev;
             prev=root;
             inorder(root.right);
         }
     }
     Node bTreeToClist(Node root){
         if(root==null){
             return null;
         }
         inorder(root);
         prev.right=head;
         head.left=prev;
         return head;
     }
     public static void main( String[] args ) {
        // Creating the binary tree
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        Solution solution = new Solution();
        Node headOfList = solution.bTreeToClist(root);
        Node current = headOfList;
        do {
            System.out.print(current.data + " ");
            current = current.right;
        } while (current != headOfList);
        System.out.println();
        current = headOfList.left; 
        do {
            System.out.print(current.data + " ");
            current = current.left;
        } while (current != headOfList.left);
        System.out.println();
    }
}
    
    
