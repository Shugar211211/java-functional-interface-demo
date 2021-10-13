package predicate_1_simple;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

// https://www.geeksforgeeks.org/java-8-predicate-with-examples/

public class App {

	public static void main(String[] args) {
		
		// Creating predicate
		Predicate<Integer> lesserThan = i -> (i < 18);
		
		// Calling predicate method
		System.out.println(lesserThan.test(10));
		
		// One more way:
		
		// Creating predicate
		IntPredicate intLesserThan = i -> (i < 18);
		
		// Calling predicate method
		System.out.println(intLesserThan.test(10));
	}
}
