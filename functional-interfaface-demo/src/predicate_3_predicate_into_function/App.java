package predicate_3_predicate_into_function;

import java.util.function.Predicate;

// https://www.geeksforgeeks.org/java-8-predicate-with-examples/

public class App {

	private static void pred(int number, Predicate<Integer> predicate) {
		if(predicate.test(number)) {
			System.out.println("Number " + number);
		}
	}
	
	public static void main(String[] args) {
		pred(10, (i) -> i>7);
	}
}
