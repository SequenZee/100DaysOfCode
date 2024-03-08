import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }

}
class Solution
{
   int count=0;
   void helper(Node root,int k,ArrayList<Integer> path){
       if(root==null){
           return;
       }
       path.add(root.data);
       int size=path.size();
       int sum=0;
       for(int i=size-1;i>=0;i--){
           sum+=path.get(i);
           if(sum==k){
               count++;
           }
       }
       helper(root.left,k,path);
       helper(root.right,k,path);
       path.remove(path.size()-1);
       
   }
   public int sumK(Node root,int k){
       ArrayList<Integer> path=new ArrayList<>();
       helper(root,k,path);
       return count;
   }
   public static void main(String[] args) {
   
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    
    int k = 3;

    Solution solution = new Solution();
    int result = solution.sumK(root, k);
    
  
    System.out.println(+ result);
}
}
