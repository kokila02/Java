package org.abc;

public class Employee {
private void empDetails() {
System.out.println("This is the empDetails");
}
private void empId() {
System.out.println("EmpId is 222");
}
private void empAge() {
System.out.println("empName is kokila");
System.out.println("empAge is 39");
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empAge();
	e.empDetails();
	e.empId();
}
}
