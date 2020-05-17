package basic.listArrayListLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListOperators {

    public static void main(String[] args) {
        //any data type: Object
        ArrayList randomArrayList = new ArrayList();
        randomArrayList.add(1);
        randomArrayList.add("Hello");
        randomArrayList.add("World");
        randomArrayList.add(17.5f);
        randomArrayList.add(89.0);
        for(Object obj:randomArrayList){
            System.out.print(obj + "  ");
        }
        System.out.println();

        //specific data type: String
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Winners");
        strings.add("never");
        strings.add("quit");
        strings.add("Quitter");
        strings.add("never");
        strings.add("win");
        System.out.println(strings);
        strings.remove(1);
        strings.remove("quit");
        System.out.println(strings);

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(12,5,9,17,99,10));
        Collections.sort(integers);
        System.out.println(integers);

        //declare ArrayList asList
        ArrayList<String> strings1 = new ArrayList<>(Arrays.asList("Winner", "never", "quit", "and", "Quitter", "never", "win"));
        Collections.sort(strings1);
        System.out.println("Ascend order: " + strings1);
        int pos = Collections.binarySearch(strings1,"Winner");
        System.out.println("Winner binarySearch: " + pos);
        Collections.sort(strings1,Collections.reverseOrder());
        System.out.println("Descend order: " + strings1);
    }

}
