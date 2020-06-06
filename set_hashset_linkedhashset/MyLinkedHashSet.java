package basic.set_hashset_linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MyLinkedHashSet {

    public static void printMyLinkedHashSet(LinkedHashSet<String> linkedHashSet){
        System.out.println(linkedHashSet);

        Iterator<String> strsIt = linkedHashSet.iterator();
        while(strsIt.hasNext()){
            System.out.print( strsIt.next().toString() + " ");
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<>();

        myLinkedHashSet.add("Hello");
        myLinkedHashSet.add("Java");
        myLinkedHashSet.add("LinkedHashSet");


        printMyLinkedHashSet(myLinkedHashSet);

    }
}
