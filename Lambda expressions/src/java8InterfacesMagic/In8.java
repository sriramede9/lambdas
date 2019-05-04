package java8InterfacesMagic;

// from java 8 we can have default method in inteface and this is not default keyword, default is a keyword used to define 
// instance methods of interface.

public interface In8 {

	// look class test for defalut method

	default void defmeth() {
		System.out.println("I am default method like instance and can be ovverride in child class");
	}

	// look class test1 for static method

	public static void staticmeth() {
		System.out.println("This is the static method and can only call with inteface name from anywhere");

		// as Static methods also available we can create main method
	}

	public static void main(String[] args) {
		System.out.println("Hello"); // we can declare main method
		staticmeth();// static static friends
		// how to call non static method?

	}
}
