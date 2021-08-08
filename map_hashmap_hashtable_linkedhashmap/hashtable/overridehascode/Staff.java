package hashtable.overridehascode;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Staff {
	String firstName;
	String lastName;
	double salary;
	Calendar dob;
	
	public Staff(String fname, String lname, double salary, GregorianCalendar dob) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + ": " + salary + ", " + dob.get(Calendar.YEAR);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getSalary() {
		return salary;
	}
	public Calendar getDob() {
		return dob;
	}
}
