package basic.listArrayListLinkedList.CompareEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Vo",2018,8,17);
        Employee emp2 = new Employee("Vo",2017,8,17);
        System.out.println(emp1.equals(emp2));
        
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(new Employee("Quynh",2016,1,15));
        employees.add(new Employee("Alen",2016,1,15));
        employees.add(new Employee("Phuong",2019,5,19));
        employees.add(new Employee("Adnan",2020,8,15));
        System.out.println(employees);
        Collections.sort(employees,new NameComparator());
        System.out.println("Name comparator: " + employees);
        Collections.sort(employees,new HiredayComparator());
        System.out.println("Hireday comparator: " + employees);
    }
}
