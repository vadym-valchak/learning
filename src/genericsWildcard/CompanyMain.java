package genericsWildcard;

import java.util.List;

import genericsWildcard.employee.Accountant;
import genericsWildcard.employee.ITSpecialist;
import genericsWildcard.employee.Manager;

import java.util.ArrayList;

public class CompanyMain {
	public static void main(String[] args) {
		Company company = new Company();
		
		Department<Accountant> accounting = new Department("Accounting", 5);
		Department<Manager> management = new Department("Management", 2);
		Department<ITSpecialist> itGuys = new Department("Management", 2);
		
		Accountant accountant = new Accountant("Alex", 1000.0f);
		ITSpecialist it = new ITSpecialist("James", 2000.0f);
		Manager manager = new Manager("Michal", 4000.0f);
		
		accounting.addEmployee(accountant);
		itGuys.addEmployee(it);
		management.addEmployee(manager);
		
		company.addDepartment(accounting);
		company.addDepartment(itGuys);
		company.addDepartment(management);
		
//		System.out.println(company);
		
		
	}
}
