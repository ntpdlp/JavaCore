package basic.set_sorted_treeset;

import java.util.Comparator;

public class MyTreeSetPersonSolutionTwo {
}


class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "{name: " + this.name + ", age: " + this.age + "}";
    }
}

class PersonComparatorName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}
