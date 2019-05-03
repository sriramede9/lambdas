package sortingcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {

	// How to sort our own object elements.
	private String name;
	private int slary;

	public Employee(String name, int slary) {
		super();
		this.name = name;
		this.slary = slary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSlary() {
		return slary;
	}

	public void setSlary(int slary) {
		this.slary = slary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emplist = new ArrayList<Employee>();

		emplist.add(new Employee("s", 10));
		emplist.add(new Employee("a", 30));
		emplist.add(new Employee("t", 60));
		emplist.add(new Employee("g", 70));
		emplist.add(new Employee("q", 90));
		emplist.add(new Employee("f", 20));

		Collections.sort(emplist,
				(o1, o2) -> (o1.getSlary() > o2.getSlary()) ? -1 : (o1.getSlary() < o2.getSlary()) ? 1 : 0);

		for (Employee g : emplist) {
			System.out.print(g.getSlary() + " ");
		}

		Collections.sort(emplist,
				(o1, o2) -> (o1.getSlary() > o2.getSlary()) ? 1 : (o1.getSlary() < o2.getSlary()) ? -1 : 0);
		System.out.println();
		for (Employee g : emplist) {
			System.out.print(g.getSlary() + " ");
		}

		Collections.sort(emplist, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
		System.out.println();

		for (Employee g : emplist) {
			System.out.print(g.getName() + " ");
		}

		Collections.sort(emplist, (o1, o2) -> (o2.getName().compareTo(o1.getName())));
		System.out.println();

		for (Employee g : emplist) {
			System.out.print(g.getName() + " ");
		}

	}

}
