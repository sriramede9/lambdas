package java8InterfacesMagic;

public class Test1 implements In8 {

	public static void main(String[] args) {
		// in general there are 3 ways to access static methods.
		// 1)

		In8.staticmeth();

		// 2)

		// Test1.staticmeth(); In inheritance parent class static are accessible by
		// child class

		// 3)

		Test1 t = new Test1();

		// t.staticmeth(); Can access through child class obj

		// It is not possible because we the static methods only belong to inteface and
		// never be visible to child class
		// no inheritance or overriding concept works in case of static methods.

		// Inteface Static Methods are only way to access.
	}

}
