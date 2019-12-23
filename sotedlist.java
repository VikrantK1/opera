class list
{
	Node head=null;
	Node tail=null;
	class Node{
		int data;
		// public Node(int data)
		// {
		// 	this.data=data;
		// }
		Node next;
	}
	public void insert(int val)
	{
		Node new_node=new Node();
		new_node.data=val;

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
	public void sortedList()
	{
		Node current=head,index=null;
		int temp;
		if (head==null) {
			return;
		}
		else
		{
			while(current!=null)
			{
				index=current;
				
					while(index!=null)
					{
						if (current.data>index.data) {
							temp=current.data;
							
							current.data=index.data;
							index.data=temp;
						}
						index=index.next;
					}
                current=current.next;
				
			}
		}
	}
	public void show()
	{
		Node current=head;
		if (head==null) {
			return;
		}
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println("");
	}
}
class sotedlist {
	public static void main(String[] args) {
		list list1=new list();
		list1.insert(2);
		list1.insert(3);
		list1.insert(4);
		list1.insert(1);
		System.out.println("original list");
		list1.show();
		list1.sortedList();
        System.out.println("Sorted list");
		list1.show();
	}
}
