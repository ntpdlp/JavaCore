package basic.listArrayListLinkedList.CompareEmployee;

import java.util.Comparator;

public class HiredayComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getHireDay() != o2.getHireDay()){
            return o1.getHireDay().compareTo(o2.getHireDay());
        }else{
            return o1.getName().compareTo(o2.getName());
        }
    }
}
