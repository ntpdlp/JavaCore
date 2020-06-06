package basic.set_sorted_treeset;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSetInteger {

    public static void printMyTreeSet(TreeSet<Integer> treeSet){
        Iterator<Integer> integerIterator = treeSet.iterator();
        while(integerIterator.hasNext()){
            System.out.print(integerIterator.next().intValue() + " ");
        }
        System.out.println(" ");
    }
    public static void printMyTreeSetDescending(TreeSet<Integer> treeSet){
        Iterator<Integer> integerIterator = treeSet.descendingIterator();
        while(integerIterator.hasNext()){
            System.out.print(integerIterator.next().intValue() + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(8);
        integers.add(4);
        integers.add(1);
        integers.add(20);
        integers.add(15);
        integers.add(0);

        printMyTreeSet(integers);
        printMyTreeSetDescending(integers);

    }
}
