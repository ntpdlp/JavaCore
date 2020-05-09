package basic.syntax.interfacejava.diamondproblem;

public interface I2 {
    default void defaultFunc(){
        System.out.println("i am I2");
    }

    void funcI2();
}
