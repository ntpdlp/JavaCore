package datastructureQueue;

public class MainQueueLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueueByLinkedList myQueue = new MyQueueByLinkedList();
		myQueue.enqueue(new QNodeLL(1));
		myQueue.enqueue(new QNodeLL(5));
		myQueue.enqueue(new QNodeLL(7));
		myQueue.enqueue(new QNodeLL(9));
		myQueue.print();
		
		
		
		QNodeLL node = myQueue.dequeue();
		if(node!=null) {
			System.out.print("Dequeue: ");
			node.printNode();
			System.out.println();
			myQueue.print();
		}
		
		
		myQueue.enqueue(new QNodeLL(10));
		myQueue.dequeue();
		myQueue.enqueue(new QNodeLL(11));
		myQueue.print();
		
	}

}
