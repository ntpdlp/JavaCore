package basic.set_hashset_linkedhashset;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {

    public static void printMySet(Set<String> mySet){
        System.out.println(mySet);

    }
    public static void main(String[] args) {
        Set<String> mySets = new HashSet<String>();
        mySets.add("Java");
        mySets.add("Java");
        mySets.add("Javascript");
        mySets.add("Selenium");
        mySets.add("Senenide");


        printMySet(mySets);
    }


}
