package basic.listArrayListLinkedList.CompareEmployee;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getName().compareTo(o2.getName()) != 0){
            return o1.getName().compareTo(o2.getName());
        }else{
            return o1.getHireDay().compareTo(o2.getHireDay());
        }
    }
}
