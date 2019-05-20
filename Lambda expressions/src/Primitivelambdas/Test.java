package Primitivelambdas;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.LongPredicate;
import java.util.function.ObjIntConsumer;
import java.util.function.ToIntFunction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// auto boxing
		// auto unboxing
		// primitive types

		// while doing arithmentic operatons on of numbers like Predicate<T>
		// those Integer values have to be converted to int for adding/sub
		// now to check T or any arithmetic conditions have convert to Int.

		// 1) you have data type int.
		// 2) you send it to predicate<T> so for <T> is is autoboxed
		// 3) now to check condition it has to unbox again as arithmetic operations can
		// only
		// can only done on data types
		// and this repeates for every element

		IntPredicate iPredicate = x -> x > 10;

		LongPredicate lPredicate = o -> o < 10;

		System.out.println(iPredicate.test(9));

		IntFunction<String> intFunction = r -> Integer.toString(r);

		System.out.println(intFunction.apply(10) + 10);

		System.out.println(lPredicate.test(8));

		ToIntFunction<String> lengFunction = x -> x.length(); // return type is always int

		System.out.println(lengFunction.applyAsInt("SriramEde"));

		ToIntFunction<Integer> sqrt = x -> (int) Math.sqrt(x);

		System.out.println(sqrt.applyAsInt(25));
		
		IntToDoubleFunction xDoubleFunction=i->Math.sqrt(i);
		
		ObjIntConsumer<Integer> consumer=(g,x)-> System.out.println(g+x);
		
		consumer.accept(10, 20);

	}

}
