package predicate_6_predicate_negate;

import java.util.function.Predicate;

// https://www.geeksforgeeks.org/java-8-predicate-with-examples/

public class App6 {
	
	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
		@Override
		public boolean test(String t) {
			return t.length()>10;
		}
	};

	private static void predicate_negate() {
		String lengthGTThan10 = "Thunderstuck is a 2012 children's film starring Kevim Durant";
		boolean outcome = hasLengthOf10.negate().test(lengthGTThan10);
		System.out.println(outcome);
	}
	
	public static void main(String[] args) {
		predicate_negate();
	}
}
