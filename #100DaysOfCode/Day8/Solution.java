class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


public class Solution
{
   
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
        
    }
    private static boolean isMirror(Node left, Node right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        return(left.data==right.data) 
            && isMirror(left.left,right.right)
            && isMirror(left.right,right.left);
    }
    public static void main( String[] args ) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(2);
        root.right.right = new Node(2);
        
        boolean result = isSymmetric(root);
        System.out.println(result);
    }


}