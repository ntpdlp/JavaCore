package basic.syntax.singleton;

//thread safe : stateless , no instance field
public class SingletonNotThreadSafe {
    private static SingletonNotThreadSafe instance;

    private SingletonNotThreadSafe(){
        System.out.println("Create singleton with not thread safe");
    }

    public static SingletonNotThreadSafe getInstance(){
        if(instance == null){
            instance = new SingletonNotThreadSafe();
        }
        return instance;
    }



    public static void main(String[] args) {
        SingletonNotThreadSafe obj1 = SingletonNotThreadSafe.getInstance();
        SingletonNotThreadSafe obj2 = SingletonNotThreadSafe.getInstance();
    }
}
