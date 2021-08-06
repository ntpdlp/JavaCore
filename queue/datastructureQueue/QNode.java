package datastructureQueue;

public class QNode {
	private int data;
	
	QNode(int value){
		data = value;
	}
	
	public void printNode() {
		System.out.print("\t" + data);
	}

}
