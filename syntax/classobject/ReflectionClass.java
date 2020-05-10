package basic.syntax.classobject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

class Person{
    public String name;
    public int age;

    Person(int age){
        this.age = age;
    }

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ReflectionClass {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        Person p1 = new Person(18,"Grit");

        Class objClass = Person.class;
        // ClassName = Pakage + SimpleName
        System.out.println("ClassName: " + objClass.getName());
        System.out.println("Package: " + objClass.getPackage());
        System.out.println("ClassSimpleName: " + objClass.getSimpleName());

        Constructor[] constructors = objClass.getConstructors();
        System.out.println("Constructors: " + Arrays.toString(constructors));
//        Constructor constructor1 = objClass.getConstructor(int.class, String.class);
//        System.out.println("Constructor: " + constructor1);

        Method[] methods = objClass.getMethods();
        for(Method m:methods){
            System.out.println(m.toString());
        }

        Field[] fields = objClass.getFields();
        for(Field field:fields){
            System.out.println(field.getName());
        }

    }
}
