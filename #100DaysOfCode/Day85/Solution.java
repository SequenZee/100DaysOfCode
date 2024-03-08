
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} 
   public class Solution {
    int findDist(Node root, int a, int b) {
        // Your code here
          Node lca= LCA(root, a, b);
        int h1=height(lca, a);
        int h2=height(lca, b);
        
        return h1+h2;
    }
    
    Node LCA( Node root, int a, int b){
        if(root == null || root.data == a || root.data == b){
            return root;
        }
        
        Node left = LCA(root.left, a, b);
        Node right = LCA(root.right, a, b);
        
        if(left == null)
        return right;
        else if(right == null)
        return left;
        else
        return root;
    }
    
    int height(Node LCA, int n){
        if(LCA == null)
        return -1;
        
        if(LCA.data == n)
        return 0;
        
        int left = height(LCA.left, n);
        int right = height(LCA.right, n);
        
         if(left == -1 && right == -1)
          return -1;
       
         else if(right == -1)
         return left + 1;
         else  
         return right + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
        int a = 2, b = 3;
        
        Solution sol = new Solution();
        int output = sol.findDist(root, a, b);
        System.out.println(output);
    }
}
