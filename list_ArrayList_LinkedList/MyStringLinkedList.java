package basic.list_ArrayList_LinkedList;

public class MyStringLinkedList {
    class Node{
        String value;
        Node next;
        Node previous;

        Node(Node next, Node previous, String value){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public String getNodeValue(){
            return this.value;
        }
    }

    Node header;
    MyStringLinkedList(){
        header = new Node(null,null,null);
    }

    public void add(String str){
        Node newNode = new Node(header.next,header,str);
        if(header.next!=null){
            header.next.previous = newNode;
        }
        header.next = newNode;
    }

    public void printMyLinkedList(){
        Node node = header.next;
        while(node!=null){
            if(node.next!=null){
                System.out.print(node.getNodeValue() + " -> ");
            }else{
                System.out.print(node.getNodeValue());
            }
            node = node.next;
        }
        System.out.println("");
    }

    public int size(){
        Node node = header.next;
        int nums = 0;
        while(node!=null){
            nums ++;
            node = node.next;
        }
        return nums;
    }

    public Node minNode(){
        if(size()<0) return null;
        Node curNode = header.next;
        Node minNode = curNode;
        while (curNode.next!=null){
            String curNodeValue = curNode.getNodeValue();
            String minNodeValue = minNode.getNodeValue();
            if(curNodeValue.compareTo(minNodeValue)<0){
                minNode = curNode;
            }
            curNode = curNode.next;
        }
        return minNode;
    }

    public static void main(String[] args) {
        MyStringLinkedList stringLinkedList = new MyStringLinkedList();
        stringLinkedList.add("5");
        stringLinkedList.add("7");
        stringLinkedList.add("1");
        stringLinkedList.add("4");

        stringLinkedList.printMyLinkedList();
        System.out.println("Size is: " + stringLinkedList.size());
        System.out.println("Minimum node value is: " + stringLinkedList.minNode().getNodeValue());
    }
}
