package basic.list_ArrayList_LinkedList;

import java.util.*;

public class SingleLinkedList {

    public static void printLinkedList(LinkedList<Integer> numLinkedList){
        int sizeLinkedList = numLinkedList.size();
        int pos = 0;
        Iterator<Integer> numsIt = numLinkedList.iterator();
        while(numsIt.hasNext() && pos<sizeLinkedList){
            if(pos == sizeLinkedList-1){
                System.out.print(numsIt.next() + "-> NULL" );
            }else{
                System.out.print(numsIt.next() + " -> ");
            }
            pos ++;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedList<Integer> numLinkedList = new LinkedList<Integer>();
        numLinkedList.add(1);
        numLinkedList.add(2);
        numLinkedList.add(3);
        numLinkedList.add(4);
        numLinkedList.add(5);

        printLinkedList(numLinkedList);
        Collections.sort(numLinkedList,Collections.reverseOrder());
        printLinkedList(numLinkedList);

        //copy, resize
        int[] a = new int[]{1,2,3,4};
        int lena = a.length;
        int[] b = new int[lena*2];
        b = Arrays.copyOf(a,lena*2);
        for(int e:b){
            System.out.println(e + " ");
        }
    }
}
