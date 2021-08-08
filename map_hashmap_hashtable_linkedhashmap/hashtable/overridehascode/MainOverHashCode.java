package hashtable.overridehascode;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class MainOverHashCode {

	public static void main(String[] args) {
		//HashMap<KeyPair, Staff> h = new HashMap<KeyPair, Staff>();
		Hashtable<KeyPair, Staff> h = new Hashtable<KeyPair, Staff>();
		Staff staff1 = new Staff("Adnan", "Shezad", 100000, new GregorianCalendar(1997, 2, 27));
		Staff staff2 = new Staff("Vo","Nguyen", 90000, new GregorianCalendar(1988, 6, 15));
		Staff staff3 = new Staff("Vo","Nguyen", 50000, new GregorianCalendar(1900, 5, 25));
		KeyPair key1 = new KeyPair(staff1.getFirstName(), staff1.getLastName());
		KeyPair key2 = new KeyPair(staff2.getFirstName(), staff2.getLastName());
		KeyPair key3 = new KeyPair(staff3.getFirstName(), staff3.getLastName());
		
		h.put(key1, staff1);
		h.put(key2, staff2); //key duplicate will be override
		h.put(key3, staff3); //key duplicate will be override ?? how to avoid collision
		
		System.out.println("Print hashmap");
		MainOverHashCode.printInfo(h);
		
		KeyPair lookup1 = new KeyPair("Joe", "Smith"); //no found
		KeyPair lookup2 = new KeyPair("Adnan", "Shezad"); //found
		KeyPair[] lookups = {lookup1, lookup2};
		for(KeyPair lookup:lookups) {
			if(h.containsKey(lookup)) {
				System.out.println("Found." + "Data returns: " + h.get(lookup));
				
			}else {
				System.out.println("No found." + lookup.toString());
			}			
		}
	}
	
	public static void printInfo(Hashtable obj) {
		Iterator<KeyPair> keys =  obj.keySet().iterator();
		while(keys.hasNext()) {
			KeyPair key = keys.next();
			Staff temp = (Staff)obj.get(key);
			System.out.println(temp.toString());
		}
		System.out.println("\n");
	}

}
