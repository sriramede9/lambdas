package ExploreInnerClasses;

public class MethodInnerclass {

	// we can create a class inside a method such classes are called method local
	// innerclasses.
	int x = 500;
	int z=600;

	void outerclassmethod() {

		int x = 100;
		
		int y=89;

		class Inner {
			int x=9090;
			void innermethod() {
				System.out.println("I am method inside inner class ");
				System.out.println("I am here as I do not want this available to other methods or users");
				System.out.println(x);//9090 and if x is not defined here it prints 100
				System.out.println(y);
				System.out.println(MethodInnerclass.this.x);//500
				System.out.println(z);// works
			}
		}
		Inner i = new Inner();
		i.innermethod();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MethodInnerclass().outerclassmethod();
	}

}
