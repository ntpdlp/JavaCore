package java8Enum;

//enum is special class, with 3 instances below:
enum Size {SMALL, MEDIUM, LARGE};

class Donut{
	private Size size; 
	private float price;
	
	Donut(Size size, int price){
		this.size = size;
		this.price = price;
	}
	
	public float getPrice() {return this.price;}
	public void applyDiscount(float percent) {
		this.price = this.price * (1- percent);
	}
	
	@Override
	public String toString() {
		return "{size: " + this.size + ", price: " + this.price + "}";
	}
}	

public class enum1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Donut d1 = new Donut(Size.LARGE, 20);
		System.out.println("Before : " + d1.toString());
		d1.applyDiscount((float)0.2);
		System.out.println("After : " + d1.toString());
	}
	
	


}
