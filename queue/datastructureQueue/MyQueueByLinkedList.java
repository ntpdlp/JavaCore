package datastructureQueue;

public class MyQueueByLinkedList {
	private int size;
	private QNodeLL head;
	private QNodeLL tail;
	
	
	
	
	MyQueueByLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void enqueue(QNodeLL node) {
		if(this.isEmpty()) {
			this.head = node;
			this.tail = node;
			this.size ++;
			return;		
		}
		
		this.tail.next = node;
		this.tail = node;
		this.size ++;
		
	}
	
	public QNodeLL dequeue() {
		if(this.isEmpty()) {
			return null;
		}
		QNodeLL node = this.head;
		this.head = this.head.next;
		this.size--;
		return node;

	}
	

	public boolean isEmpty() {
		return (this.size == 0);
	}


	
	public void print() {
		if(this.isEmpty()) {
			System.out.println("Empty.");
			return;
		}
		
		
		System.out.print("Queue: ");
		QNodeLL tempPos = this.head;
		int sizeList = this.size;
		while(sizeList>0) {
			tempPos.printNode();
			sizeList --;
			tempPos = tempPos.next;			
			if(tempPos == null) {
				break;
			}
			
		}
		
		System.out.println(" ");
	}

}
