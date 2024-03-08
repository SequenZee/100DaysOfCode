class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}


class Solution
{
public static boolean isDeadEnd(Node root)
{
    
    boolean ans=dend(root,1,Integer.MAX_VALUE);
    return ans;
    
}
public static boolean dend(Node root,int min,int max){
    if(root==null){
        return false;
    }
    if(min==max){
        return true;
    }
    return dend(root.left,min,root.data-1)||dend(root.right,root.data+1,max);
}

public static void main(String[] args) {
   
    Node root = new Node(8);
    root.left = new Node(5);
    root.right = new Node(9);
    root.left.left = new Node(2);
    root.left.right = new Node(7);
    root.left.left.left = new Node(1);

    boolean result = isDeadEnd(root);
    if (result)
        System.out.println("Yes");
    else
        System.out.println("No");
}
}
