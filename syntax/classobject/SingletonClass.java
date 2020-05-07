package basic.syntax.classobject;

public class SingletonClass {
    private static SingletonClass singletonObj;
    private String key;

    private SingletonClass(){
        key = "OneKeyOnly";
        getKey();
    }

    public static SingletonClass getSingletonObject(){
        if(singletonObj != null){
            System.out.println("Fail! key was already given !!");
            return singletonObj;
        }else{
            System.out.println("key is generated successfully.");
            singletonObj = new SingletonClass();
            return singletonObj;
        }
    }

    private void getKey(){
        System.out.println("Key is " + key);
    }

    public static void main(String[] args) {
        SingletonClass key1 = SingletonClass.getSingletonObject();
        SingletonClass key2 = SingletonClass.getSingletonObject();

    }

}
