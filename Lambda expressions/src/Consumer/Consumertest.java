package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Consumertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// how to use predicate Function and consumer in one stance
		List<Student> studentlist = new ArrayList<>();

		studentlist.add(new Student("Sri", 99));
		studentlist.add(new Student("Hari", 59));
		studentlist.add(new Student("Shri", 89));
		studentlist.add(new Student("hani", 39));

		// marks greater than 60

		Function<Student, String> function = g -> g.getGrade();

		List<Student> paasedList = greaterthant(studentlist, (p) -> p.getMarks() > 60);

		Consumer<List<Student>> consumer = v -> {

			// System.out.println("who passed are " + v.getName()+"and grades are
			// "+v.getGrade());
			for (int i = 0; i < v.size(); i++) {
				System.out.println(v.get(i).getGrade());
			}
		};

		consumer.accept(paasedList);
	}

	private static List<Student> greaterthant(List<Student> studentlist, Predicate<Student> p) {
		// TODO Auto-generated method stub
		List<Student> passList = new ArrayList<>();
		for (Student f : studentlist) {
			if (p.test(f)) {
				passList.add(f);
			}
		}
		return passList;

	}
	
	//chaining of consumers c1.andThen(c2).andThen(c3).accept(); like function inside function

}

class Student {

	private String name;
	private int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getGrade() {
		// TODO Auto-generated method stub
		if (this.getMarks() > 80) {
			return "A";
		}
		return "B";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}