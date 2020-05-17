package basic.listArrayListLinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListOperators {
    public static void main(String[] args) {
        LinkedList<Integer> linkedLists = new LinkedList<>();
        linkedLists.add(10);
        linkedLists.add(2);
        linkedLists.add(500);
        linkedLists.add(257);
        linkedLists.add(8);
        System.out.println("unsorted: " + linkedLists);
        Collections.sort(linkedLists);
        System.out.println("sorted: " + linkedLists);
        linkedLists.remove(1);
        linkedLists.removeFirst();
        linkedLists.removeLast();
        System.out.println(linkedLists);

        //init with value
        LinkedList<Float> floats = new LinkedList<>(Arrays.asList(12.0f,35.2f,3.0f,0.0f, 60.7f));
        Collections.sort(floats);
        System.out.println(floats);
        int pos = Collections.binarySearch(floats,12.0f);
        System.out.println("Find 0.0 in list: " + pos);

    }
}
