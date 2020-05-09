package basic.syntax.interfaceDiamondProblem;

public class Main implements I1,I2{

    public static void main(String[] args) {
        Main runner = new Main();
        runner.defaultFunc();
    }

    @Override
    public void defaultFunc() {
        //to solve duplicate default func from Interface
        // 1. override the conflict
        // 2. use "super" to specific Interface for the duplicated func
        I1.super.defaultFunc();
        I2.super.defaultFunc();
    }

    @Override
    public void funcI2() {
        System.out.println("i am override funcI2");
    }

    @Override
    public void funcI1() {
        System.out.println("i am override funcI1");
    }
}
