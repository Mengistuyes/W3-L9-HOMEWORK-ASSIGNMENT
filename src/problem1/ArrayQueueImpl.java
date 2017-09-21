package problem1;

public class ArrayQueueImpl {
private int[] arr = new int[10];
private int front = -1;
private int rear = 0;
	ArrayQueueImpl()
	{
		arr=new int[10];
		front=0;
	}
	public int peek() {
		return this.arr[front];
	}
	public void enqueue(int obj){
		if(rear==arr.length-1){
			resize();
		}
		this.arr[rear]=obj;
		this.rear++;
	}
	public int dequeue() {	
		if(isEmpty())
		{
			System.out.println("Queue is empty!");
			return -1;
		}
		return this.arr[front++];
	}
	public boolean isEmpty(){
	return front==rear;
	}
	public int size(){
		int s=0;
	for(int i=this.front;i<rear;i++)
	{
		s++;
	}
	return s;
	}
	 private void resize(){
		 int newSize=this.size();
		 if(this.size()<5)
		 {
			 newSize=10;
		 }
		 else
		 {
			 newSize=this.size()*2;
		 }
		 int[] MyNewArray=new int[newSize];
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 MyNewArray[i]=arr[i];
		 }
		 arr=MyNewArray;
	}
	 public static void main(String[] args)
	 {
		 ArrayQueueImpl aq=new ArrayQueueImpl();
		 System.out.println("_______________Before adding items to the queue_________\n ");
		 System.out.println("Front: " + aq.front);
		 System.out.println("rear: " + aq.rear);
		 aq.enqueue(90);
		 aq.enqueue(190);
		 aq.enqueue(29);
		 aq.enqueue(77);
		 aq.enqueue(89);
		 aq.enqueue(200);
		 aq.enqueue(150);
		 aq.enqueue(7);
		 System.out.println("_______________After enqueuing/adding 8 items to the queue_________\n "); 
		 for(int i=aq.front;i<aq.rear;i++)
		 {
			System.out.println(i+1 + "." + aq.arr[i]); 
		 }
		 aq.dequeue();
		 aq.dequeue();
		 aq.dequeue();
		 System.out.println("_______________After removing/dequeuing 3 items from the queue_________\n ");

		 System.out.println("Front: " + aq.front);
		 System.out.println("rear: " + aq.rear + "\n");
		 
		 for(int i=aq.front;i<aq.rear;i++)
		 {
			 System.out.println(i+1 + "." + aq.arr[i]); 
		 }
		 System.out.println("Size of the queue is " + aq.size());
		 
	 }
}
