package Introduction;

public class Test1 {
	
	static void meth(Shape s) {
		s.draw();
	}
	
	public static void main(String[] args) {
		Shape rectangle=()-> System.out.println("this is rectangle calling");
		rectangle.draw();
		
		
		Shape1 circlearea=(a,b)-> 2*a*b;
		
		System.out.println(circlearea.area(12,21));
		
		// using this on Run in Runnable interface
		
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		};
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
//		t1.start();
//		t2.start();
		
		Shape square=()->System.out.println("Square here");
		
		meth(square); // sending behavior as an arguement.
		
		meth(()->System.out.println("this is another symbol"));
		
	}
}
