package datastructureQueue;

public class MainQueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueueByArray myQueue = new MyQueueByArray(3);
		myQueue.enqueue(new QNode(1));
		myQueue.enqueue(new QNode(5));
		myQueue.enqueue(new QNode(7));
		myQueue.print();
		
		
		
		QNode node = myQueue.dequeue();
		if(node!=null) {
			System.out.print("Dequeue: ");
			node.printNode();
			System.out.println();
			myQueue.print();
		}
		
		
		myQueue.enqueue(new QNode(9));
		myQueue.dequeue();
		myQueue.enqueue(new QNode(11));
		myQueue.print();
		
	}

}
