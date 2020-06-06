package basic.list_ArrayList_LinkedList;

import java.util.*;

public class AccessList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Vo","Adnan","Asad","Phuong","Quynh","Eden","Tem"));

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(50);
        numbers.add(100);

        //Method1: tranditional way - index
        //Method2: Iterator interface - a way to loop through a collection
        //Method3: forEach (new from Java8)
        //ArrayList: 3 methods
        //LinkedList: 2 methods (2,3) can't apply index => that will make it slow.


        //1.index
        for(int i=0; i<names.size(); i++){
            System.out.print(names.get(i) + " ");
        }
        System.out.println("");
        //2.Iterator
        Iterator<String> nameIt = names.iterator();
        while(nameIt.hasNext()){
            System.out.print(nameIt.next() + " ");
        }
        System.out.println("");
        Iterator<Integer> numIt = numbers.iterator();
        while(numIt.hasNext()){
            System.out.print(numIt.next() + " ");
        }
        System.out.println("");
        //3.forEach
        names.forEach(e -> System.out.print(e + " "));
        numbers.forEach(e -> System.out.print(e + " "));
    }
}
