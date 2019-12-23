import java.util.*;

class List{
    class Node{
    long data;
    Node next;

}
    Node  head=null;
    Node tail=null;
    public void insert(long value)
    {
         Node new_node=new Node();
       new_node.data=value;
       new_node.next=null;
      if(head==null)
      {
         head=new_node;
         tail=new_node;
      }
      else
      {
         tail.next=new_node;
         tail=new_node;
      }
       
    }
    public Node sortedlist(Node head1)
    {
        Node current=head1;
        Node prev=null;Node nextN=null;
        
        
        while(current!=null)
       {
           nextN=current.next;
           current.next=prev;
           prev=current;
           current=nextN;
       }
       return prev;
    }
    public void show()
    {
         Node current=head;
       while(current!=null)
       {
           System.out.print(current.data+" ");
           current=current.next;
       }
    }
         
}
class sortedprogram {
    public static void main(String args[] ) throws Exception {
        List list=new List();
        // Scanner scan=new Scanner(System.in);
        // int T=scan.nextInt();
        // while(T-->0)
        // {          
        //     list.insert(scan.nextLong());
        // }
        list.insert(2);
        list.insert(1);
        list.insert(5);
        list.insert(6);
        list.show();

    }
}
