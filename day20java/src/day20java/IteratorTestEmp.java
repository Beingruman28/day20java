package day20java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day20java.Employee;

public class IteratorTestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1001, "virat", 1900000.00, "virat.rcb@cricket.com"));
		empList.add(new Employee(1002, "maxwell", 95000.00, "maxwell.rcb@cricket.com"));
		empList.add(new Employee(1003, "siraj", 130000.00, "siraj.rcb@cricket.com"));
		empList.add(new Employee(1004, "fafduplessis", 150000.00, "fafduplessis.rcb@cricket.com"));
		empList.add(new Employee(1005, "dinesh", 140000.00, "dinesh.rcb@cricket.com"));
		empList.add(new Employee(1006, "shahbaz", 190000.00, "shahbaz.rcb@cricket.com"));
		empList.add(new Employee(1007, "harshal", 195000.00, "harshal.rcb@cricket.com"));
		empList.add(new Employee(1008, "finn", 30000.00, "finn.rcb@cricket.com"));
		empList.add(new Employee(1009, "david", 50000.00, "david.rcb@cricket.com"));
		empList.add(new Employee(1010, "karn", 140000.00, "karn.rcb@cricket.com"));

		Iterator<Employee> iterator = empList.iterator();
		while (iterator.hasNext()) {
			Employee employee =  iterator.next();
			if(employee.getSalary()<=50000.00)
				iterator.remove();
		}

		Iterator<Employee> iterator2 = empList.iterator();
		while (iterator2.hasNext()) {
			Employee employee =  iterator2.next();
			System.out.println(employee);
		}
		System.out.println("------------------------------");
		Iterator<Employee> iterator3 = empList.iterator();
		iterator3.forEachRemaining(System.out::println);
		
		Iterator<Employee> iterator4 = empList.iterator();
		while (iterator4.hasNext()) {
			Employee employee =  iterator4.next();
			if(employee.getId()>=1005)
				iterator.remove();
			System.out.println("-------------------------------------------------------");
			
			System.out.println(employee);
		}
		
}
}