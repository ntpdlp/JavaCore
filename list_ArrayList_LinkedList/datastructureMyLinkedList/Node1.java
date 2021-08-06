package datastructureMyLinkedList;

public class Node1 {
	
	private Student data;
	public Node1 next;
	
	Node1(Student data){
		this.data = data;
		this.next = null;
	}
	

	public void printNode() {
		data.printInfo();
	}
	
	public boolean hasID(int studentId) {
		return (this.data.getId() == studentId);
	}
}
