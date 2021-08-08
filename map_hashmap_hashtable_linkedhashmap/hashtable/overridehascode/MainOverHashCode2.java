package hashtable.overridehascode;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class MainOverHashCode2 {

	public static void main(String[] args) {
		//Hashtable<KeyPair, Staff> h = new Hashtable<KeyPair, Staff>();
		MyHashTable h = new MyHashTable();
		Staff staff1 = new Staff("Adnan", "Shezad", 100000, new GregorianCalendar(1997, 2, 27));
		Staff staff2 = new Staff("Federe", "Hash", 1005000, new GregorianCalendar(1957, 1, 14));
		Staff staff3 = new Staff("Vo","Nguyen", 90000, new GregorianCalendar(1988, 6, 15)); 
		Staff staff4 = new Staff("Nguyen","Vo", 50000, new GregorianCalendar(1900, 5, 25));
		Staff staff5 = new Staff("Elizabeth","Lay", 80000, new GregorianCalendar(1990, 7, 17));
		
		Staff[] staffs = {staff1, staff2, staff3, staff4, staff5};
		KeyPair[] keys = new KeyPair[staffs.length];
		for(int i = 0 ; i < staffs.length ; i++) {
			keys[i]= new KeyPair(staffs[i].getFirstName(), staffs[i].getLastName());
			System.out.println(keys[i].hashCode());
			h.put(keys[i], staffs[i]);
		}
				
		System.out.println("Print hashmap");
		h.printInfo();		

	}
}
