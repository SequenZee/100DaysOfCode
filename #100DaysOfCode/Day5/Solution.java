class Node {
    int data;
     Node next;
     Node(int d)  { data = d;  next = null; }
 }
 
 public class Solution
 {
    public static Node findIntersection(Node head1, Node head2)
     {
         // code here.
         Node x=head1,y=head2,res=null,head=null;
         while(x!=null && y!=null){
             if(x.data<y.data)
                 x=x.next;
             else if(x.data>y.data)
                 y=y.next;
             else{
                 Node t=new Node(x.data);
                 if(head==null)
                     head=t;
                 else
                     res.next=t;
                 res=t;
                 y=y.next;
                 x=x.next;
             }
         }
         return head;
     }
     public static void main(String[] args) {
       
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(6);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);
        Node intersection = findIntersection(head1, head2);
        while (intersection != null) {
            System.out.print(intersection.data + " ");
            intersection = intersection.next;
        }
        System.out.println();
    }
 }

 
