
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


public class Solution
{
       int rahee = 0;
    public  int distributeCandy(Node root)
    {
        
     
        gg(root);
        return rahee;
    }
    public  int gg(Node root)
    {
        if(root == null) 
        {
            return 0;
        }
        
        int left = gg(root.left);
        int right = gg(root.right);
        rahee += Math.abs(left) + Math.abs(right);
        return root.data + left + right - 1;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(0);
        root.right = new Node(0);

        Solution obj = new Solution();
        int result = obj.distributeCandy(root);

        System.out.println(result);
    }
}
