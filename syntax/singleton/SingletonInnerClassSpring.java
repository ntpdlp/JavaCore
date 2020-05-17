package basic.syntax.singleton;

public class SingletonInnerClassSpring {

    private static class SingletonContainer{
        private static SingletonInnerClassSpring instance = new SingletonInnerClassSpring();
    }

    private SingletonInnerClassSpring(){
        System.out.println("constructor....");
    }

    public static SingletonInnerClassSpring getInstance(){
        System.out.println("call to getInstance");
        return SingletonContainer.instance;
    }

    public static void main(String[] args) {
        SingletonInnerClassSpring.getInstance();
        SingletonInnerClassSpring.getInstance();
        SingletonInnerClassSpring.getInstance();
        SingletonInnerClassSpring.getInstance();

        System.out.println("Play game: let guess how may times constructor is called?");

    }
}
