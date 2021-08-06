package datastructureQueue;

public class QNodeLL {
	private int data;
	public QNodeLL next;
	
	QNodeLL(int value){
		this.data = value;
		this.next = null;
	}
	
	public void printNode() {
		System.out.print("\t" + data);
	}

}
