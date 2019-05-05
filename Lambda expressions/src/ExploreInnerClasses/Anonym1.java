package ExploreInnerClasses;


//Anonymous inner class that extends a class.
public class Anonym1 {
	
	public static void main(String[] args) {
		Thread t=new Thread(  new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Running");
			}
			
		} );
		t.start();
		
		Runnable r=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Actual things");
			}
			
		};
		
		Thread t1=new Thread(r);
		t1.start();
		
		Thread t2=new Thread()
		{
			// means now yout t2 is the object of child class.
			
		};
	}

}
