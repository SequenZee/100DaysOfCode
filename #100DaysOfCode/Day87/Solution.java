
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}


public class Solution
{
   
    static int  isEqual = 1;
    
    public static void helper(Node root){
        if(isEqual==0){
            return ;
        }
        if(root==null){
            return ;
        }
        if(root.left==null && root.right ==null){
            return ;
        }
        int temp = 0;
        if(root.left!=null){
            temp += root.left.data;
        }
        if(root.right!=null){
            temp += root.right.data;
        }
        if(root.data!=temp){
            isEqual = 0;
            return ;
        }
        helper(root.left);
        helper(root.right);
    }
    public static int isSumProperty(Node root)
    {
        // add your code here
        
        helper(root);
        int ans = isEqual;
        isEqual = 1;
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(35);
        root.left = new Node(20);
        root.right = new Node(15);
        root.left.left = new Node(15);
        root.left.right = new Node(5);
        root.right.left = new Node(10);
        root.right.right = new Node(5);

        int output = isSumProperty(root);
        System.out.println(output);
    }
}
