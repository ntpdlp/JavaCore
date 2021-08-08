package hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MaiHashTableDefault {

	public static void main(String[] args) {
		Hashtable<Integer,String> hTable=new Hashtable<Integer,String>();

        //adding or set items in Hashtable by put method key and value pair
        hTable.put(1, "Java");
        hTable.put(5, "C++");
        hTable.put(3, "Python"); //{5=C++, 3=Python, 1=Java}
        hTable.put(1, "SE");
        System.out.println(hTable); //{5=C++, 3=Python, 1=SE}
        
        printHashTable(hTable);

       
	}
	
	public static void printHashTable(Hashtable hTable) {  
		 System.out.println("\nPrint hashtable with your own custome style!");
        Iterator<Integer> iterator = hTable.keySet().iterator();
        while(iterator.hasNext()) {
       	 Integer key = iterator.next();
       	 System.out.println("key = " + key.toString() + ", value = " + hTable.get(key));
        }
	}


}
