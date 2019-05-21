package FourDots;

import ExploreInnerClasses.Staticinnerclass.staticInnerclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf interf=()->{
			System.out.println("yo man I am implemented");
		};
		
		interf.m1();
		
		Interf i=Impl::m1;
		
		i.m1();
		
		Interf interf2=Impl::m2;
		
		interf2.m1();
		
		Interf interf3=Impl::m3;
		
		interf3.m1();
		
		// for non static obj::method
		
		Interf interf4=new Impl()::m4;
		
		interf4.m1();
		
		//for constructor?
		
		Interf interf5=Impl::new;
		
		interf5.m1();
		
		Runnable runnable=new X()::tun;
		
		Thread thread=new Thread(runnable);
		thread.start();

	}

	
	
}


class X {
	
	public void tun() {
		System.out.println("I am here");
	}
}

class Impl {

	
	
	public Impl() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("I am a constructor");
	}

	public static void m1() {
		// TODO Auto-generated method stub
		System.out.println("Me Reborn"); // both methods of same arguement types.
	}
	
	public static void m2() {
		System.out.println("another method");
	}
	
	public static String m3() {
		return "Whatever";
	} 
	
	
	public void m4() {
		System.out.println("this is non static");
	}
}
