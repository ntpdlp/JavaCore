package basic.queue;

import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueueTest {

    public static void printMyQueue(Queue<Integer> integerQueue){
        System.out.print("My Queue is: ");
        Iterator<Integer> integerIterator = integerQueue.iterator();
        while(integerIterator.hasNext()){
            Integer current = integerIterator.next();
            System.out.print(current.intValue() + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(5);
        myQueue.add(1);
        myQueue.add(10);
        myQueue.add(2);
        printMyQueue(myQueue);
    }
}
