package ExploreInnerClasses;

// inteface with defaulg implementation.

interface Vehicle {

	void numofwheels();

	class Bike implements Vehicle {

		@Override
		public void numofwheels() {
			// TODO Auto-generated method stub
			System.out.println("These are the number of wheels here it's 2");
		}

	}

}

// class with modified implementation.

class Car implements Vehicle {

	@Override
	public void numofwheels() {
		// TODO Auto-generated method stub
		System.out.println("4 wheeler");
	}

}

//we can have an interface inside and interface,we can implement any one of them or both based on requirement and we can implement
// only oourer or inner with their own implementation.

interface Outer {
	void out();

	interface Inner {
		void in();
	}
}

class esp implements Outer.Inner {

	@Override
	public void in() {
		// TODO Auto-generated method stub
		System.out.println("we can implement only in");
	}

}

public class IntefacewithDefaultImpl {

	public static void main(String[] args) {
		Vehicle.Bike v = new Vehicle.Bike();
		v.numofwheels();

		Car c = new Car();
		c.numofwheels();

		esp e = new esp();
		e.in();
	}

}
