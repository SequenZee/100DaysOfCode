import java.util.*;
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


class Solution{
    public static void printPathsUtil(Node currNode, int sum, int sumSoFar, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> ans){
        if(currNode == null){
            return;
        }
        sumSoFar += currNode.data;
        path.add(currNode.data);
        if(sumSoFar == sum){
            ans.add(new ArrayList<>(path));
        }
        if(currNode.left != null){
            printPathsUtil(currNode.left, sum, sumSoFar, path, ans);
        }

        if(currNode.right != null){
            printPathsUtil(currNode.right, sum, sumSoFar, path, ans);
        }
        path.remove(path.size() - 1);
    }
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum){
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        printPathsUtil(root, sum, 0, path, ans);
        return ans;
    }

    public static void main(String[] args) {
        int sum = 8;
        Node root = new Node(1);
        root.left = new Node(20);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(15);
        root.right.left.left = new Node(6);
        root.right.left.right = new Node(7);
        root.right.right.left = new Node(8);
        root.right.right.right = new Node(9);

        ArrayList<ArrayList<Integer>> result = printPaths(root, sum);

        for (ArrayList<Integer> path : result) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        }
    }
}
