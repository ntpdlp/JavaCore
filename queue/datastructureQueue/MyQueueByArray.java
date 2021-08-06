package datastructureQueue;

public class MyQueueByArray {
	private int size;
	private int maxsize;
	private int head;
	private int tail;
	private QNode[] queue;
	
	
	
	MyQueueByArray(int size) {
		this.maxsize = size;
		queue = new QNode[this.maxsize];
		head = 0;
		tail = 0;
		size = 0;
	}

	public void enqueue(QNode node) {
		if(this.isFull()) {
			System.out.println("Full.");
			return;		
		}
		
		size++;
		this.queue[tail] = node;
		tail++;
		if(tail == maxsize) {
			tail = 0;
		}

		
	}
	
	public QNode dequeue() {
		if(this.isEmpty()) {
			return null;
		}
		
		this.size--;
		QNode node = this.queue[this.head];
		this.head++;
		return node;

	}
	

	public boolean isEmpty() {
		return (size == 0);
	}



	public boolean isFull() {
		return (size == maxsize);
	}

	
	public void print() {
		if(this.isEmpty()) {
			System.out.println("Empty.");
			return;
		}
		
		
		System.out.print("Queue: ");
		int tempPos = this.head;
		while(true) {
			this.queue[tempPos].printNode();

			tempPos++;
			if(tempPos == this.maxsize) {
				tempPos = 0;
			}
			if(tempPos == this.tail) {
				break;
			}
			
		}
		
		System.out.println(" ");
	}

}
