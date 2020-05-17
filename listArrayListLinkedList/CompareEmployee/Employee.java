package basic.listArrayListLinkedList.CompareEmployee;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee {
    private String name;
    private Date hireDay;

    Employee(String name, int aYear, int aMonth, int aDay){
        this.name = name;
        GregorianCalendar aDate = new GregorianCalendar(aYear,aMonth-1,aDay);
        this.hireDay = aDate.getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDay() {
        return (Date)hireDay.clone();
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return this.name.equals(employee.name) &&
                this.hireDay.equals(employee.hireDay);
    }

    @Override
    public int hashCode() {
        return 57+ name.hashCode() + hireDay.hashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDay=" + hireDay +
                '}';
    }
}
