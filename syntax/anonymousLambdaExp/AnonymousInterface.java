package basic.syntax.anonymousLambdaExp;

interface Animal{
    void eat();
}

public class AnonymousInterface {

    public static void main(String[] args) {
        Animal duck = new Animal() {
            public void eat() {
                System.out.println("duck eat cap cap");
            }
        };
        duck.eat();

        Animal fish = new Animal(){
            @Override
            public void eat(){
                System.out.println("fish eat oc oc oc");
            }
        };
        fish.eat();

    }
}
