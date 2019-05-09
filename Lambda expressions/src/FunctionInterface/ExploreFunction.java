package FunctionInterface;

import java.util.function.Function;

public class ExploreFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// funciton to remove spaced betwwn the strings
		Function<String, String> function = t -> t.replace(" ", "");

		funcitontotest("Sri Ram Ede and now remove spaced btween these words", function);

		// write a funcion to count number of spaces in the String
		Function<String, Integer> function2 = t -> {
			return t.length() - t.replace(" ", "").length();

		};

		funcitontotest1("Sri Ram Ede and now remove spaced btween these words", function2);

		// funciton chaining

		// f1.andThen(f2)
		// f1.compose(f2);

		// exmaple 1 make the letters in the string capital and return first 9 letters

		Function<String, String> f1 = s -> s.toUpperCase();

		Function<String, String> f2 = s -> s.substring(0, 8);

		fandthen("SriRamEde Sri", f1.andThen(f2));

		// example 2 to demonstrate f1compose(f2)

		fcompose("SriRamEde SRi", f1.compose(f2));
		
		// similarly f1 2* the given number of a number
		// f2 cube of a number
		
		// f1.andthen f2= 2*number and then cube of it 4 cube 64
		//fi.compose fg= cube and then 2*number of it 8*2 16 
	}

	private static void funcitontotest1(String string, Function<String, Integer> function2) {
		// TODO Auto-generated method stub
		System.out.println(function2.apply(string));
	}

	private static void funcitontotest(String string, Function<String, String> function) {
		// TODO Auto-generated method stub
		System.out.println(function.apply(string));
	}

	// funciton chaining

	// f1.andThen(f2)
	// f1.compose(f2);

	// exmaple 1 make the letters in the string capital and return first 9 letters
	private static void fandthen(String string, Function<String, String> andThen) {
		// TODO Auto-generated method stub
		System.out.println(andThen.apply(string));
	}

	// exaple to use of cutting 9 letter fist and then capitalizing it
	private static void fcompose(String string, Function<String, String> compose) {
		// TODO Auto-generated method stub
		System.out.println(compose.apply(string));
		
	}
}
