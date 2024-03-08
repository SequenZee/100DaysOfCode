class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class Solution
{
    
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    if(root1==null && root2==null){
	        return true;
	    }
	    
	    if(root1==null ||root2==null||(root1.data!=root2.data)){
	        return false;
	    }
	    return isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
	}
    

    public static void main(String[] args) {
       
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        
       
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

     
        Solution solution = new Solution();
        boolean result = solution.isIdentical(root1, root2);
        
    
        if (result) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
    }
}
