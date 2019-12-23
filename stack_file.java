import java.util.*;
class stack_file{
	Scanner Scanner1=new Scanner(System.in);
	 int  no_data;
	public static   void value(int no_data)
	{
		this.no_data=no_data;
	}
	
	  int   stack[]=new int[no_data];
     int top=0;
	public void push(int data)
	{
		if (top==5) {
			
			  System.out.println("Stack is full");
		}
		else
		{
			stack[top]=data;
			System.out.print(stack[top]+" ");
		  top++;  
			
		}


	}
	public static   int size()
	{
		return top;
	}
	public boolean isEmpty()
	{
		if (top<=0) {
			return true;
		}
		else
		{
			return false;
		}
	}

	public int  pop()
	{
		int value=0;
		if (top==0) {
			System.out.print(" there is nothing to delete");
		
		}
		else
		{
				top--; 
         	value=stack[top];

         stack[top]=0;
		}

             
     
         
		return value;
		}
	

	public int  pick()
	{
     return stack[top];
	}
	public   void show(int val)
	{
		for (int i=0;i<val;i++) {
			System.out.print(stack[i]+" ");
		}
	}
	public  static void main(String[] args) {
		 int value=Scanner1.nextInt();
        value(value);
		stack_file stack1=new stack_file();
		for (int i=0;i<=value;i++ ) {
			stack1.push(i);
		}
        for (int i=0;i<=value;i++ ) {
			stack1.pop();
		}
		// System.out.println();
		// System.out.println(stack1.pick());
		// for (int i=1;i<4;i++ ) {
		// 	System.out.print(stack1.pop()+" ");
		// }
		
       // stack1.push(56);
		//   stack1.pop();
		//   System.out.println();
  //       System.out.println(stack1.pop()+" ");
		  // show(3);
		   System.out.println();
		   System.out.println(size()+" ");
		  System.out.println(stack1.isEmpty());
	}
}