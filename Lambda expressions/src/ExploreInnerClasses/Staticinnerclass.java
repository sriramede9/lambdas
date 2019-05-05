package ExploreInnerClasses;

public class Staticinnerclass {

	public static class staticInnerclass {

		void statmeth() {
			System.out.println("instance method of static inner class");
		}

		static void staticmeth() {
			System.out.println("class method in static inner class");
		}
	}

	public static void main(String[] args) {

		Staticinnerclass.staticInnerclass cs = new Staticinnerclass.staticInnerclass();// way to call inner static class
		cs.statmeth();

		Staticinnerclass.staticInnerclass.staticmeth();
	}
}
