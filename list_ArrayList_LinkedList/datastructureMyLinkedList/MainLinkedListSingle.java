package datastructureMyLinkedList;

public class MainLinkedListSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedListSingle myList = new MyLinkedListSingle();
		myList.insert(new Node1(new Student("Mai",10)), 0);
		myList.insert(new Node1(new Student("Lan",20)), 0);
		
		
		//chen cuoi
		myList.insert(new Node1(new Student("Xoai",50)), 7);
		myList.printList();
		
		//chen dau lai ne
		myList.insert(new Node1(new Student("Man",15)), 0);		
		myList.printList();
		
//		int searchId = 5;
//		Node1 searchNode = myList.searchById(searchId);
//		if(searchNode == null) {
//			System.out.println("\nKo tim thay id=" + searchId );
//		}else {
//			System.out.println("\nTim thay, thong tin chi tiet la: " );
//			searchNode.printNode();
//		}
//		
//		
		//chen giua
		myList.insert(new Node1(new Student("Song",22)), 2);
		myList.printList();
		
		//xoa dau
		myList.remove(3);
		myList.printList();
		
		//xoa cuoi
		myList.remove(2);
		myList.printList();

		
		//xoa giua
		myList.remove(4);
		myList.printList();

	}

}
