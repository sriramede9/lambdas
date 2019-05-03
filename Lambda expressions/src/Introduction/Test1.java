package Introduction;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test1 {

	static void meth(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		Shape rectangle = () -> System.out.println("this is rectangle calling");
		rectangle.draw();

		Shape1 circlearea = (a, b) -> 2 * a * b;

		System.out.println(circlearea.area(12, 21));

		// using this on Run in Runnable interface

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
//		t1.start();
//		t2.start();

		Shape square = () -> System.out.println("Square here");

		meth(square); // sending behavior as an arguement.

		meth(() -> System.out.println("this is another symbol"));

		Predicate<Integer> p = x -> x > 5; // take something and returns boolean

		System.out.println(p.test(4));// test is the method that is defined and to be invoked.

		Consumer<String> name = (st) -> System.out.println(st); // take something and never retrunt anything

		name.accept("SRI RAM EDE"); // It has accept method to consume

		Function<String, Integer> fun = s -> s.length(); // function which accept something and returns something
															// <Accept,Retrun>

		Integer len = fun.apply("SriramEde");// it uses apply to apply the method
		System.out.println(len);

		Supplier<Integer> supply = () -> 5; // it keeps supplying whenever we ask so..

		System.out.println(supply.get()); // get is used to get from supply

		BiConsumer<String, Integer> bic = (a, b) -> System.out.println(a + b); // Biconsumer takes parameters returns
																				// nothing

		bic.accept("Sri", 9); // Bic do use accept

		BiPredicate<Integer, Integer> bip = (a, b) -> a > b;

		System.out.println(bip.test(5, 4));

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

		System.out.println(sum.apply(10, 10));

		Function<String, Integer> leng = String::length;

		System.out.println(leng.apply("Sri"));

		Consumer<Shape> rect = Shape::draw;

		rect.accept(() -> System.out.println("Areal"));

	}
}
