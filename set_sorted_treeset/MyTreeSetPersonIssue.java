package basic.set_sorted_treeset;

import java.util.TreeSet;

public class MyTreeSetPersonIssue {

    public static void main(String[] args) {
        class Person{
            private String name;
            private int age;

            Person(String name, int age){
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "age='" + age + '\'' +
                        ", name=" + name +
                        '}';
            }
        }

        // Issue: when executing, will fail because Tree is order type, it doesn't know how to compare 2 Person
        TreeSet<Person> personTreeSet = new TreeSet<Person>();
        personTreeSet.add(new Person("Vo",20));
        personTreeSet.add(new Person("Adnan",18));
        personTreeSet.add(new Person("Eden",28));
        System.out.println(personTreeSet);
    }
}
