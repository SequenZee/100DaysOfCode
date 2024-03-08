
class Node
{
    int data;
    Node left;
    Node right;
    int height;

    Node(int x){
        data=x;
        left=right=null;
        height=1;
    }
}

public class Solution
{
    public Node insertToAVL(Node node,int data)
    {
        if(node==null){
            return new Node(data);
        }
        
        if(node.data>data){
            node.left=insertToAVL(node.left,data);
        }else if(node.data<data){
            node.right=insertToAVL(node.right,data);
        }
        
        node.height=Math.max(height(node.left),height(node.right))+1;
        int diff=height(node.left)-height(node.right);
        
        if(diff>1){
            if(data<node.left.data){
                return rightRotate(node);
            }else if(data>node.left.data){
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }else if(diff<-1){
            if(data<node.right.data){
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }else if(data>node.right.data){
                return leftRotate(node);
            }
        }
        return node;
        
    }

    public Node leftRotate(Node a){
        Node b=a.right;
        Node t2=b.left;
        
        b.left=a;
        a.right=t2;
        
        a.height=Math.max(height(a.left),height(a.right))+1;
        b.height=Math.max(height(b.left),height(b.right))+1;
        return b;
    }
    
    public Node rightRotate(Node a){
        Node b=a.left;
        Node t2=b.right;
        b.right=a;
        a.left=t2;
        a.height=Math.max(height(a.left),height(a.right))+1;
        b.height=Math.max(height(b.left),height(b.right))+1;
        return b;
    }
    
    public int height(Node node){
        if(node == null){
            return 0;
        }else{
            return node.height;
        }
    }

    public static void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public static void main( String[] args ) {
        int[] values = {5, 1, 4};
        Solution solution = new Solution();
        Node root = null;
        for (int value : values) {
            root = solution.insertToAVL(root, value);
        }
        inorderTraversal(root); 
    }
}      
