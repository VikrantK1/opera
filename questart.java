import java.util.*;
class double_link{
	class Node1{
		int data;
        Node1 next;
        Node1 prev;
    }
    Node1 head=null;
    Node1 tail=null;
    public void insert(int val)
    {
    	Node1 new_node=new Node1();
          new_node.data=val;
          new_node.next=null;
          new_node.prev=null;
    	if (head==null) {
    		new_node.prev=tail;
    		head=new_node;
    		tail=new_node;
    	}
    	else
    	{
    		new_node.prev=tail;
    		tail.next=new_node;
    		tail=new_node;
    	}
     	// head.next=new_node;
     	
     
    }
    public void show_start()
    {
    	Node1 current=head;
    	while(current!=null)
    	{
         System.out.print(current.data+" ");
         current=current.next;
    	}
    }
    public void show_reverse()
    {
    	Node1 current=tail;
    	while(current!=null)
    	{
         System.out.print(current.data+" ");
         current=current.prev;
    	}
    }
    public void insert_start(int value)
    {
     Node1 newNode=new Node1();
      newNode.data=value;
     newNode.prev=null;
     newNode.next=null;
     if (head==null) {
     	head=newNode;
     	tail=newNode;
     }
     else
     {
     	newNode.prev=null;
     	head.prev=newNode;
     	newNode.next=head;
     	head=newNode;     	
     }
    }
    public void insert_end(int value)
    {
      Node1 newNode=new Node1();
      newNode.data=value;
     newNode.prev=null;
     newNode.next=null;
     if (head==null) {
     	head=newNode;
     	tail=newNode;
     }
     else
     {
     	newNode.prev=tail;
     	tail.next=newNode;
     	tail=newNode;
     	
     }
    }
    public void insert_middle_after(int value,int after)
    {
      Node1 newNode=new Node1();
      newNode.data=value;
     newNode.prev=null;
     newNode.next=null;
     if (head==null) {
     	head=newNode;
     	tail=newNode;
     }
     else
     {
     	Node1 current=head;
     	int check=0;
     	while(current!=null)
     	{
     		if (current.data==after) {
     			check=1;
     			if (current.next==null) {
     				insert(value);
     			}
     			else
     			{
     				Node1 temp=current;
     			newNode.prev=temp.next.prev;
               newNode.next=temp.next;
               temp.next=newNode;
               temp.next.next.prev=newNode;
               
               
               
                break;
     			}
     		}
     	
         current=current.next;
     	}
       if (check!=1) {
       	System.out.println("Value is not present here");
       }

     }
    }
    public void insert_middle_before(int value,int before)
    {
     Node1 newNode=new Node1();
      newNode.data=value;
     newNode.prev=null;
     newNode.next=null;
     if (head==null) {
     	head=newNode;
     	tail=newNode;
     }
     else
     {
     	Node1 current=head;
     	int check=0;
     	while(current!=null)
     	{
     		if (current.data==before) {
     			check=1;
     			if (current.prev==null) {
     				insert_start(value);
     			}
     			else
     			{
     				Node1 temp=current;
     			newNode.prev=temp.prev.next;
                newNode.next=temp;
                temp.next.prev=newNode;
                temp.prev.next=newNode;
               
               
               
                break;
     			}
     		}
     	
         current=current.next;
     	}
       if (check!=1) {
       	System.out.println("Value is not present here");
       }

     }
    }
    public void delete_start()
    {
   head=head.next;
   head.prev=null;
    }
    public void delete_end()
    {
    tail=tail.prev;
    tail.next=null;
    }
    public void delete_middle_after(int after)
    {
    Node1 current=head;
    while(current!=null) {
    	if (current.data==after) {
            if (current.next==null) {
            	System.out.println("No data after"+after);
            }
            else
            {
            	Node1 temp=current;
    		temp.next=temp.next.next;
             current.next.prev=current;
            }
    		break;
    	}
    	current=current.next;
    }
   
    
   
    }
     public void delete_middle_before(int before)
    {
     Node1 current=head;
    while(current!=null) {
    	if (current.data==before) {
            if (current.prev==null) {
            	System.out.println("No data before="+before);
            }
            else
            {
            Node1 temp=current;
    		temp.prev.prev.next=temp;
            current.prev=current.prev.prev;
            }
    		break;
    	}
    	current=current.next;
    }

    }
    public void delete_specific(int value)
    {
        Node1 current=head;
    while(current!=null) {
    	if (current.data==value) {
            Node1 temp=current;
    		temp.prev.next=temp.next;
    		current.next.prev=current.prev;
            //current.prev=current.prev.prev;
            
    		break;
    	}
    	current=current.next;
    }

    }
    public void replace(int value,int replace1)
    {
    Node1 current=head;
    while(current!=null) {
    	if (current.data==value) {
          
            current.data=replace1;	
            //current.prev=current.prev.prev;
            
    		break;
    	}
    	current=current.next;
    }
    }
}

class questart{
	
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	  double_link doubl=new double_link();
       doubl.insert(34);
       doubl.insert(67);
       doubl.insert(37);
       doubl.insert(68);
      // doubl.insert_start(23);
       doubl.insert_end(69);
       // doubl.insert_middle_after(56,69);
       // doubl.insert_middle_before(99,34);
     //  doubl.delete_start();
       // doubl.delete_end();
     //  doubl.delete_middle_after(69);
     // doubl.delete_middle_before(34);
      // doubl.delete_specific(37);
       doubl.replace(37,60);
        doubl.show_start();
        
       System.out.println();
       doubl.show_reverse();
	}
}