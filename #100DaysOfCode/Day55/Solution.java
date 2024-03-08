import java.util.ArrayList;
import java.util.Collections;
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} 

public class Solution
{
    static Node mergeResult(Node node1, Node node2)
    {
   
    if(node1==null && node2==null){
        return null;
    }
    ArrayList<Integer> arr = new ArrayList<>();
    while(node1!=null){
        arr.add(node1.data);
        node1 = node1.next;
    }
    while(node2!=null){
        arr.add(node2.data);
        node2 = node2.next;
    }
    Collections.sort(arr);
    int n= arr.size();
    Node head = new Node(arr.get(n-1));
    Node temp=head;
    for(int i=n-2;i>=0;i--){
        temp.next = new Node(arr.get(i));
        temp=temp.next;
    }
    return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        
        Node list2 = new Node(2);
        list2.next = new Node(4);
        
        Node result = mergeResult(list1, list2);
        printList(result); 
    }

}