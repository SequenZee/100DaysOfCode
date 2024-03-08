import java.util.*;
class Node{
    int data;
    Node next;

    Node(int x){
        data=x;
        next=null;
    }
}
class Solution {
    public Node sortedInsert(Node head, int data) {
     
         Node newnode=new Node(data);
       
          if(head==null){
                 
                 newnode.next=newnode;
                 return newnode;
           }
        
           if(head.data>=data){
                   newnode.next=head;
                   Node temp=head;
                   while(temp.next!=head){
                       temp=temp.next;
                   }
                   temp.next=newnode;
                   return newnode;
           }
        
           else{
                 Node temp=head;
                 while(temp.next!=head && temp.next.data<data){
                            temp=temp.next;
                 }
                newnode.next=temp.next;
                temp.next=newnode;
                return head;
           }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = head; 

        int data = 2;

        Solution sol = new Solution();
        Node output = sol.sortedInsert(head, data);
        Node temp = output;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != output);
        System.out.println();
    }
}