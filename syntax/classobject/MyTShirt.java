package basic.syntax.classobject;



public class MyTShirt {

    private String color;
    private Size size;

    MyTShirt(String color, Size size){
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString(){
        return "Color " + this.color + ", size: " + this.size;
    }

    public static void main(String[] args) {
        MyTShirt t1 = new MyTShirt("blue",Size.MED);
        MyTShirt t2 = new MyTShirt("red",Size.LARGE);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}
