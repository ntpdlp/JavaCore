package hashtable.overridehascode;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashTable {
	private static final int INIT_SIZE = 11;
	private int tableSize;
	private LinkedList[] table;
	
	private class Entry{
		private KeyPair key;
		private Staff value;
		
		Entry(KeyPair key, Staff value){
			this.key = key;
			this.value = value;
		}
		
		@Override
		public String toString(){
			return key.toString()+"->"+value.toString();
		}
			
	}
	
	public MyHashTable(int tableSize) {
		this.tableSize = tableSize;
		this.table = new LinkedList[this.tableSize];
	}
	
	public MyHashTable() {
		this(INIT_SIZE);
	}
	
	//convert big number to smaller one
	private int hash(int bigNum) {
			return Math.abs(bigNum % tableSize);
	}

	public void printInfo() {

		for(int i = 0; i<this.tableSize; i++) {
			if(table[i] != null) {
				System.out.println("\nTable at " + i);
				printLinkedList(table[i]);
			}
			
		}
	}
	
	public void put(KeyPair key, Staff value) {
		//hashtable don't accept NULL
		if(key == null) return;
		
		int hashCode = key.hashCode();
		int hash = this.hash(hashCode);
		
		Entry e = new Entry(key, value);
//		System.out.println("At hash value: " + hash + " -> " + e.toString());
		boolean keyAlreadyUsed = false;
		
		//add first item into list
		if(table[hash] == null) {
			table[hash] = new LinkedList();
		}
		System.out.println("Add at position: " + hash + "\t" + e.toString());
		table[hash].add(e);
		
		
	}
	
	public boolean containsKey(KeyPair key) {
		int hashCode = key.hashCode();
		int hash = this.hash(hashCode);
		if(table[hash] == null) {
			return false;
		}else {
			return true;
		}
	}
	
	public LinkedList get(KeyPair key) {
		int hashCode = key.hashCode();
		int hash = this.hash(hashCode);
		return table[hash];
	}
	
	public void printLinkedList(LinkedList<Entry> list) {
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Entry entry = (Entry)iterator.next();
			System.out.println(entry.toString());			
		}
	}
}
