
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
public class Solution
{
    public static int sumOfLeafNodes(Node root)
    {
        
          if(root==null)return 0;
        if(root.left == null && root.right == null)return root.data;
        return sumOfLeafNodes(root.left)+sumOfLeafNodes(root.right);
    }

    public static void main(String[] args) {
       
        Node root = new Node(67);
        root.left = new Node(34);
        root.right = new Node(82);
        root.left.left = new Node(12);
        root.left.right = new Node(45);
        root.right.left = new Node(78);

       
        int result = sumOfLeafNodes(root);
        System.out.println(result); 
    }
}
