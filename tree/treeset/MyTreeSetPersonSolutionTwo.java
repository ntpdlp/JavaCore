package basic.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTreeSetPersonSolutionTwo {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>(new PersonComparatorAge());
        persons.add(new Person("Vo",25));
        persons.add(new Person("Rocky",18));
        persons.add(new Person("Melenine",11));
        System.out.println("Sort in Age: " + persons);

        TreeSet<Person> person2s = new TreeSet<>(new PersonComparatorName());
        person2s.add(new Person("Windy",21));
        person2s.add(new Person("Rocky",90));
        person2s.add(new Person("Alenine",19));
        person2s.add(new Person("Pepsi",19));
        System.out.println("Sort in Name: " + person2s);

    }

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class PersonComparatorName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class PersonComparatorAge implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge()<o2.getAge()) return -1;
        else{
            if(o1.getAge()>o2.getAge()) return 1;
            else return 0;
        }
    }
}
