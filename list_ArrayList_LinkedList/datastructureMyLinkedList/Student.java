package datastructureMyLinkedList;

public class Student {
	private static int autoid = 0;
	private int id;
	private int age;
	private String name;
	
	
	Student(String name, int age){		
		this.id = autoid++;
		this.name = name;
		this.age = age;
		
	}
	
	
	public void printInfo() {
		System.out.println("Student: " + this.id + ", name: " + this.name + ", age: " + this.age);
	}


	public static int getAutoid() {
		return autoid;
	}


	public static void setAutoid(int autoid) {
		Student.autoid = autoid;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
