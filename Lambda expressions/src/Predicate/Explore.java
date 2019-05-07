package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	private String nameString;
	private int salary;

	public Employee(String nameString, int salary) {
		super();
		this.nameString = nameString;
		this.salary = salary;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class Explore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> listEmployees = new ArrayList<>();

		listEmployees.add(new Employee("srk", 2000));
		listEmployees.add(new Employee("rk", 3000));
		listEmployees.add(new Employee("trk", 5000));
		listEmployees.add(new Employee("wrk", 4000));

		// create a predicate to filter employes whose salary is greate than 3000
		salaryfileter(listEmployees, e -> e.getSalary() > 3000);

		// creat a preidate to filet the employees name start with w
		System.out.println("-------------------");


		salaryfileter(listEmployees, p -> p.getNameString().charAt(0) == 'w');

		// joing two predicate in this case join predicates starts with r and s

		Predicate<Employee> sPredicate = r -> r.getNameString().charAt(0) == 's';
		Predicate<Employee> rPredicate = r -> r.getNameString().charAt(0) == 'r';
		
		System.out.println("-------------------");
		
		salaryfileter(listEmployees, sPredicate.or(rPredicate));
		
		// how to filter null and empty vlaues in a string array;
		
		String h[]= {"Sri","","king",null};
		Predicate<String> psPredicate=d-> d==""||d==null;
		
		nullfilter(h,psPredicate);
		
	}

	private static void nullfilter(String[] h, Predicate<String> psPredicate) {
		// TODO Auto-generated method stub
		List<String> newliList=new ArrayList<String>();
		for(String f:h) {
			if(!psPredicate.test(f)) {
				newliList.add(f);
			}
		}
		System.out.println(newliList);
	}

	public static void salaryfileter(List<Employee> l, Predicate<Employee> p) {
		for (Employee e : l) {
			if (p.test(e)) {
				System.out.println(e.getNameString());
			}
		}
	}
}
