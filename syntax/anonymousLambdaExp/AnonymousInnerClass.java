package anonymous;

public class AnonymousInnerClass {
	interface Welcome{
		public void sayHello();
	}
	
	public void prepareNewComer() {
		(new Welcome() {
			@Override
			public void sayHello() {
				System.out.println("hello to newscomer");
			}
		}).sayHello();
	}
	
	public static void main(String[] args) {
		(new AnonymousInnerClass()).prepareNewComer();
	}

}
