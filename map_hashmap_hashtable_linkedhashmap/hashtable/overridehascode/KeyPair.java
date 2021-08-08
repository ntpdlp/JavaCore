package hashtable.overridehascode;

public class KeyPair {
	String first;
	String second;
	
	public KeyPair(String f, String s) {
		first = f;
		second = s;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}
	
	@Override
	public String toString() {
		return "Key {first: " + getFirst() + ", second: " + getSecond() + "}";
	}

	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != this.getClass()) return false;
		KeyPair p = (KeyPair)ob;
		return p.first == first && p.second == second;
	}
	
	@Override
	public int hashCode() {
		int result = 50; //seed
		int hashFirst = first.hashCode();
		int hashSecond = second.hashCode();
		result += 31 * result + hashFirst + hashSecond;
		return result;
		
	}
}
