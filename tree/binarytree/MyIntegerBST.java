package basic.tree.binarytree;

public class PhuongNguyenBST {
    private class BinaryNode{
        Integer valueNode;
        BinaryNode leftNode;
        BinaryNode rightNode;

        BinaryNode(Integer value){
            this.valueNode = value;
            this.leftNode = null;
            this.rightNode = null;
        }
    }
}
