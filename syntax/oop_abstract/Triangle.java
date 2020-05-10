package basic.syntax.oop_abstract;

final public class Triangle extends ClosedCurve {

    double height;
    double base;

    Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    double computeArea() {
        return base*height*0.5;
    }
}
