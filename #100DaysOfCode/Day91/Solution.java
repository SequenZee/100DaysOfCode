import java.util.*;
    class Node{
        int val;
        ArrayList<Node> neighbors;
        public Node(){
            val = 0;
            neighbors = new ArrayList<>();
        }
    
        public Node(int val){
            this.val = val;
            neighbors = new ArrayList<>();
        }
    
        public Node(int val, ArrayList<Node> neighbors){
            this.val = val;
            this.neighbors = neighbors;
        }
    }

public class Solution{
    Node cloneGraph(Node node){
        if(node == null){
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        return help(node, map);
    }
    
    Node help(Node org, Map<Node, Node> map){
        if(org == null){
            return null;
        }
        
        if(map.containsKey(org)){
            return map.get(org);
        }
        Node clone = new Node(org.val);
        map.put(org, clone);
        
        for(Node neighbor : org.neighbors){
            clone.neighbors.add(help(neighbor, map));
        }
        return clone;
    }
    public static void main(String[] args) {
        
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        
        node0.neighbors.add(node1);
        node0.neighbors.add(node3);
        node1.neighbors.add(node0);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node0);
        node3.neighbors.add(node2);

    
        Solution sol = new Solution();
        Node clonedNode = sol.cloneGraph(node1);

        System.out.println(clonedNode.val);
    }
}
