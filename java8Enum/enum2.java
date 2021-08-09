package java8Enum;


interface Calculate{
	public int calc(int a, int b);
}

//enum MyCalcEnum {ADD,SUB}; has 2 INSTANCEs
enum MyCalcEnum implements Calculate{
	ADD {
		@Override
		public int calc(int a, int b) {
			return a+b;
		}
	},
	SUB {
		@Override
		public int calc(int a, int b) {
			return a-b;
		}
	}
}

public class enum2 {
	
	public static void main(String[] args) {
		int num1 = (int)MyCalcEnum.ADD.calc(5,2);
		int num2 = (int)MyCalcEnum.SUB.calc(5,2);
		System.out.println("Add: " + num1);
		System.out.println("Sub: " + num2);
	}

}
