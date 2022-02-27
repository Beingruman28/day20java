package day20java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import day20java.Employee;

public class ListIteratorEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1001, "virat", 1900000.00, "virat.rcb@cricket.com"));
		empList.add(new Employee(1002, "fafduplessis", 150000.00, "fafduplessis.rcb@cricket.com"));
		empList.add(new Employee(1003, "maxwell", 95000.00, "maxwell.rcb@cricket.com"));
		empList.add(new Employee(1004, "siraj", 130000.00, "siraj.rcb@cricket.com"));
		empList.add(new Employee(1005, "lomror", 150000.00, "lomror.rcb@cricket.com"));
		empList.add(new Employee(1006, "dinesh", 140000.00, "dinesh.rcb@cricket.com"));
		empList.add(new Employee(1007, "shahbaz", 190000.00, "shahbaz.rcb@cricket.com"));
		empList.add(new Employee(1008, "harshal", 195000.00, "harshal.rcb@cricket.com"));
		empList.add(new Employee(1009, "finn", 30000.00, "finn.rcb@cricket.com"));
		empList.add(new Employee(1010, "david", 50000.00, "david.rcb@cricket.com"));
		empList.add(new Employee(1011, "karn", 140000.00, "karn.rcb@cricket.com"));
		

		iterateListUsingListIterator(empList);
		addElementsInListUsingListIterator(empList);
		deleteElementsInListUsingListIterator(empList);
		replaceElementsInListUsingListIterator(empList);
	}

	private static void iterateListUsingListIterator(List<Employee> empList) {

		ListIterator<Employee> listIterator = empList.listIterator();
		System.out.println("Forward direction::::");
		while (listIterator.hasNext()) {
			Employee employee = listIterator.next();
			System.out.println(employee);

		}
		System.out.println("Backward direction::::");
		while (listIterator.hasPrevious()) {
			Employee employee = (Employee) listIterator.previous();
			System.out.println(employee);
		}
		System.out.println("---------------------------------------------------------------------");
	}

	private static void addElementsInListUsingListIterator(List<Employee> empList) {
		ListIterator<Employee> listIterator = empList.listIterator();
		while (listIterator.hasNext()) {
			Employee employee = listIterator.next();
			if(!employee.getName().equalsIgnoreCase("hasaranga")) {
				listIterator.add(new Employee(9999, "hasaranga", 90000.00, "hasaranga.rcb@cricket.com"));
				break;
			}
		}
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		System.out.println("---------------------------------------------------------------------");
	}

	private static void deleteElementsInListUsingListIterator(List<Employee> empList) {

		ListIterator<Employee> listIterator = empList.listIterator();
		while (listIterator.hasNext()) {
			Employee employee = listIterator.next();
			if(employee.getName().equalsIgnoreCase("lomror")) {
				listIterator.remove();
			}
		}
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		System.out.println("---------------------------------------------------------------------");
	}

	private static void replaceElementsInListUsingListIterator(List<Employee> empList) {


		ListIterator<Employee> listIterator = empList.listIterator();
		while (listIterator.hasNext()) {
			Employee employee = listIterator.next();
			if(employee.getName().equalsIgnoreCase("finn")) {
				employee.setName("josh hazlewood");
				listIterator.set(employee);
			}
		}
		for (Employee employee : empList) {
			System.out.println(employee);
		}

		System.out.println("---------------------------------------------------------------------");
	}
}