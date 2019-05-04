package Anonymousvslambdas;

//creating Anonymous class

interface In {
	void m();
}

public class Trail1 {

	public int x = 777;

	public void m2() {// this is to show this keyword usage in anonymous inner class

		In in = new In() {

			int x = 999;

			@Override
			public void m() {
				// TODO Auto-generated method stub
				System.out.println("I am anonymous class inside this in and in is my object.");

				// now this in anonymous class belongs to the scope in{} so this.x gives 999

				System.out.println("this is to show this in anonym class \t" + this.x);
			}

		};

		in.m();// this is way to access anonmouys inner class
		//

	}

	public void m3() {// let;s see how to do it in case of lambdas

		In i = () -> {
			int x = 999;

			System.out.println("I am lamda of that functional interface with only on absm");

			// now this in lambda expressing and x belongs to the scope this class which is
			// trail one so this.x gives 777

			System.out.println("this is to show this in lambda \t" + this.x);
		};
		i.m();// way to call with lambda exression --> remember how we call predicate
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trail1 t = new Trail1();

		t.m2();

		t.m3();
	}

}
