package basic.syntax.functionalinterface;

public class Main implements MyFunctionalInterface {
    @Override
    public void myMethod() {
        System.out.println("Hello, I am a User-defined Functional Interface");
        System.out.println("I contain inside ONLY 1 abstract function - no body. ");
    }

    public static void main(String[] args) {
        Main runner = new Main();
        runner.myMethod();
    }
}
