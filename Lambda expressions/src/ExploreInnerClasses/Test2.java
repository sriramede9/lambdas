package ExploreInnerClasses;

public class Test2 {

	public int x = 10;
	public static int y = 9;

	class innerclass {

		int x = 900;

		void minn() {
			int x = 9090;
			System.out.println(x + " " + y); // inner class can access any variables from outer class

			System.out.println(innerclass.this.x);// prints 900

			System.out.println(Test2.this.x);

		}

	}

	void m2() {
		innerclass in = new innerclass();
		in.minn();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test2().m2();
	}

}
