package basic.treeset;

import java.util.TreeSet;

public class MyTreeSetPersonSolutionOne {
    public static void main(String[] args) {
        class Person implements Comparable<Person> {
            private String name;
            private int age;

            Person(String name, int age){
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(Person o) {
                //first sort by age
                if(this.age<o.age) return -1;
                if(this.age == o.age){
                //then sort by name
                    if(this.name.compareTo(o.name)<0) return -1;
                    if(this.name.compareTo(o.name)==0) return 0;
                    return 1;
                }
                return 1;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "age='" + age + '\'' +
                        ", name=" + name +
                        '}';
            }
        }

        TreeSet<Person> personTreeSet = new TreeSet<Person>();
        personTreeSet.add(new Person("Vo",20));
        personTreeSet.add(new Person("Adnan",18));
        personTreeSet.add(new Person("John",18));
        personTreeSet.add(new Person("Eden",28));
        System.out.println(personTreeSet);
    }
}
