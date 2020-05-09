package basic.syntax.oop.oop_abstract;

final public class Square extends ClosedCurve {
    double side;

    Square(double side){
        this.side = side;
    }

    @Override
    double computeArea() {
        return side*side;
    }
}
