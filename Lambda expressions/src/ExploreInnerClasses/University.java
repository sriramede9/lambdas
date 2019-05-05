package ExploreInnerClasses;

public class University {

	class Department {
		// university does not exists without departments
		// similarly Car no exist withoud enginer

		void depmeth() {
			System.out.println("I am method inside Department");
		}

		// inside inner class we cannot declare any static methods ,hence we cannot
		// declare main method, we cannot run
		// inner class directly from cmd.
	}

	void unimeth() {
		System.out.println("I am a university method");

		// how to call Dept method from outer class method class
		
		//University.Department ud = new University().new Department();
		Department d=new Department(); // we can directly create an object for inner class as to call 
										// inner classe which is non static unimethod we need and object new University()
		d.depmeth();

	}

	public static void main(String[] args) {
		// how to access inner class method
//		University.Department ud = new University().new Department();
//		ud.depmeth();
		new University().unimeth();
	}
}
