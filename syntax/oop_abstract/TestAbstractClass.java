package basic.syntax.oop_abstract;

public class TestAbstractClass {
    public static void main(String[] args) {
        ClosedCurve[] shapes = {new Square(3),new Triangle(5,3), new Circle(7)};
        // Open-Closed OO Principle: Open to Extension, Close for Modification
        for(ClosedCurve shape:shapes){
            double cal = shape.computeArea();
            String type = shape.getClass().getSimpleName();
            System.out.println(type + " says" + shape.sayHello() + ", " + cal);
        }
    }
}
