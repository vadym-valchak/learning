package genericsWildcard;

import genericsWildcard.employee.Employee;
import java.util.List;
import java.util.ArrayList;

public class Department<T extends Employee> {
	private String name;
	private int employeeNumber;
	private List<T> employees = new ArrayList<>();
	
	public Department(String name, int employeeNumber) {
		this.name = name;
		this.employeeNumber = employeeNumber;
	}
	
	public boolean addEmployee(T employee) {
		return employees.add(employee);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public List<T> getEmployees() {
		return employees;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", employeeNumber=" + employeeNumber + ", employees=" + employees + "]";
	}
}
