package basic.syntax.oop_noinheritance_composition;

class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "name: " + name + ", age: " + age;
    }
}

// Use the composition instead of inheritance
class PersonWithJob{
    Person person;
    int salary;

    PersonWithJob(Person person, int salary){
        this.person = person;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return person.toString() + ", salary: " + salary;
    }
}



public class NoInheritance_CompositionSolution {
    public static void main(String[] args) {
       Person p = new Person("Vo",18);
       PersonWithJob pwj = new PersonWithJob(p,80000);
        System.out.println(pwj);
    }
}
