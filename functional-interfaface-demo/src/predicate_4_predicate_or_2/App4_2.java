package predicate_4_predicate_or_2;

import java.util.function.Predicate;

// https://www.geeksforgeeks.org/java-8-predicate-with-examples/

public class App4_2 {
	
//	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
//		@Override
//		public boolean test(String t) {
//			return t.length() > 10;
//		}
//	};
	
	public static void predicate_or() {
		Predicate<String> containsLetterA = p -> p.contains("A");
		Predicate<String> hasLengthOf10 = p -> { return p.length() > 10; };		// replaced definition of the predicate
		String containsA = "And";
		boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
		System.out.println(outcome);
	}
	
	public static void main(String[] args) {
		predicate_or();
	}
}
