package basic.syntax.interfaceDiamondProblem;

public interface I2 {
    default void defaultFunc(){
        System.out.println("i am I2");
    }

    void funcI2();
}
