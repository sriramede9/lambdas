package java8InterfacesMagic;

public class Test implements In8 {

	void m2() {
		defmeth();// works before we override it in our imple class and once overrided it will
					// call local class
	}

	public void defmeth() {// if it is overriden we cannot call the super class defmeth();
		// super.defmeth(); does not work
		System.out.println("overriding the default method in Inteface");
	}

	public static void main(String[] args) {
		Test t = new Test();
		// t.defmeth();
		t.m2();
	}
}
