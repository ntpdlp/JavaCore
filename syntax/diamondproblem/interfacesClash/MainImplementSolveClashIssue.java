package interfacesClash;

public class MainImplementSolveClashIssue implements Sup1, Sup2 {

	public static void main(String[] args) {
		int i1 = Sup1.myMethod();
		int i2 = Sup2.myMethod();
		
		int c = MainImplementSolveClashIssue.myMethod();
		
		System.out.println("I1: " + i1);
		System.out.println("I2: " + i2);
		System.out.println("C: " + c);
	}
	
	public static int myMethod() {
		return 10;
	}

}
