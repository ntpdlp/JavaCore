package basic.map_sorted_treemap;

import java.util.TreeMap;

public class MyTreeMap {
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
                if(this.age<o.age) return -1;
                if(this.age == o.age){
                    //compare name
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


        TreeMap<Integer,Person> employees = new TreeMap<>();
        employees.put(3,new Person("Vo",15));
        employees.put(1,new Person("Adnan",18));
        employees.put(2,new Person("Eden",12));
        System.out.println(employees);
    }
}
