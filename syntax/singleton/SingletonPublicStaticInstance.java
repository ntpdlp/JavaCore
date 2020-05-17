package basic.syntax.singleton;

public class SingletonPublicStaticInstance {
    public static final SingletonPublicStaticInstance INSTANCE = new SingletonPublicStaticInstance();

    private SingletonPublicStaticInstance(){
        System.out.println("obj created");
    }

    public static void main(String[] args) {
        SingletonPublicStaticInstance obj1 = SingletonPublicStaticInstance.INSTANCE;
        SingletonPublicStaticInstance obj2 = SingletonPublicStaticInstance.INSTANCE;

    }
}
