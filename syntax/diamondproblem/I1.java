package basic.syntax.diamondproblem;

public interface I1 {
    default void defaultFunc(){
        System.out.println("i am I1");
    }

    void funcI1();
}
