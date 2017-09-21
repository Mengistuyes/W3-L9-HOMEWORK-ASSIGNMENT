package problem2;

import java.util.NoSuchElementException;

	interface Stack1
	{ 
		public void push(Object ob);
		public Object pop();
		public Object peek();
		public boolean isEmpty();
		public int size();
	}

public class StackUsingLinkedList implements Stack1 {

	public static void main(String[] args) {
		
		StackUsingLinkedList Sul=new StackUsingLinkedList();
		Object item;
		
		Sul.push("Mengistu");
		Sul.push("Messi");
		Sul.push("Kaka");
		Sul.push("Seble");
		
		System.out.println("Current Stack Size After pusing 4 items is " + Sul.getSize());
			
		Sul.display();
		System.out.println("\n");
		
			//pop item from the list
		item=Sul.pop();
		System.out.println(item + " is deleted from the list\n");
		Sul.display();
				
		System.out.println("Current Stack Size " + Sul.getSize() + "\n");
		
		System.out.println("Current Stack data found at the top " + Sul.peek() + "\n");
		
		Sul.push("Timinit");
		Sul.push("Teddy");
		Sul.push("Ephrem");
		System.out.println("Current Stack Size After pusing 3 items is " + Sul.getSize());
		//pop item from the list
		item=Sul.pop();
		System.out.println(item + " is deleted from the list");
		System.out.println("Current Stack data found at the top " + Sul.peek());
		System.out.println("Current Stack Size " + Sul.getSize());
		
		System.out.println("\n");
		Sul.display();
	}

	   protected Node top ;
	    protected int size ;
	 
	    public StackUsingLinkedList()
	    {
	        top = null;
	        size = 0;
	    }    
	    
	  
	    public int getSize()
	    {
	        return size;
	    }    
	    
	@Override
	public void push(Object data) {
	
		  Node temp = new Node (data, null);
	        if (top == null)
	            top = temp;
	        else
	        {
	            temp.setNextNode(top);
	            top = temp;
	        }
	        size++ ;
	}

	@Override
	public Object pop() {
	
		if(top==null)
		{
			throw new NoSuchElementException("Underflow Exception");
		}
		Node temp=top;
		top=temp.getNextNode();
		size--;
		return temp.data;
	}

	@Override
	public Object peek() {
		if(top==null)
		{
			return null;
		}
		return top.data;
	}

	@Override
	public boolean isEmpty() {
		return top==null;
	}
	public void display()
	{
		if(top==null)
		{
			System.out.println("There is no item in the stack");
		}
		else
		{
			int count=1;
			Node temp=top;
			
			while(temp!=null)
			{
				System.out.println(count + ". " + temp.data);
				temp=temp.NextNode;
				
				count++;
			}
		}
	}
	@Override
	public int size() {
		return this.getSize();
	}
	class Node{
		private Node NextNode;
		private Object data; 		
		Node()
		{
			data=null;
			NextNode=null;
		}
		Node(Object data,Node NextNode)
		{
			this.data=data;
			this.NextNode=NextNode;
		}
		public Node getNextNode() {
			return NextNode;
		}
		public void setNextNode(Node nextNode) {
			NextNode = nextNode;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
	}
	

}
