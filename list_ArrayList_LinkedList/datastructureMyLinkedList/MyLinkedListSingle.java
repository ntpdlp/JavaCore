package datastructureMyLinkedList;

public class MyLinkedListSingle {
	
	private int size;
	public Node1 head;
	public Node1 tail;
	
	public MyLinkedListSingle() {
		// TODO Auto-generated constructor stub
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	
	public void insert(Node1 node, int position) {
		//chen dau
		if(position < 1 || this.size == 0) {
			if(this.isEmpty()) {
				this.head = node;
				if(this.tail == null) {
					this.tail = node;
				}
				
				this.size ++;
				return;
			}
			node.next = this.head;
			this.head = node;
			this.size ++;
			return;
		}
		
		//chen duoi
		if(position >= this.size) {
			if(this.isEmpty()) {
				this.tail = node;
				if(this.head == null) {
					this.head = node;
				}
				this.size++;
				return;
			}
			
			this.tail.next = node;
			this.tail = node;
			this.size++;
			return;
		}
		
		//chen giua: can 1 cap de soat ve
		Node1 preNode = null;
		Node1 curNode = this.head;
		int counter = 0;
		while(counter < position) {
			preNode = curNode;
			curNode = curNode.next;
			counter++;
		}
		node.next = curNode;
		preNode.next = node;
		this.size ++;
		return;
	}
	
	public void remove(int studentID) {
		Node1 temp = this.searchById(studentID);
		if(temp == null) {
			return;
		}
		
		//xoa node dau dong
		if(this.head.hasID(studentID)) {
			this.head = head.next;
			this.size--;
			return;
		}
		
		//xoa node cuoi dong
		if(this.tail.hasID(studentID)) {
			Node1 preNode = null;
			Node1 curNode = head;
			int curPos = 0;
			while(curPos<size && curNode.next != null) {
				preNode = curNode;
				curNode = curNode.next;
				curPos ++;
			}
			preNode.next=null;
			this.tail = preNode;			
			this.size--;
			return;
		}
		
		//xoa node o giua
		Node1 preNode = head;
		Node1 curNode = head.next;
		int curPos = 1;
		while(curPos<size && !curNode.hasID(studentID)) {
			preNode = curNode;
			curNode = curNode.next;
			curPos ++;
		}
		preNode.next=curNode.next;			
		this.size--;
		return;
	}
	
	
	
	public boolean isEmpty() {
		return (this.size == 0);
	}
	
	public Node1 searchById(int studentID) {
		
		Node1 curNode = this.head;
		while(curNode != null) {
			if(curNode.hasID(studentID)) {
				return curNode;
			}
			curNode = curNode.next;
		}
		return null;
	}
	
	public void printList() {
		if(this.isEmpty()) {
			return;
		}
		System.out.println("\n");
		Node1 tempNode = this.head;
		while(tempNode != null) {
			tempNode.printNode();
			tempNode = tempNode.next;
		}
		
	}
}
