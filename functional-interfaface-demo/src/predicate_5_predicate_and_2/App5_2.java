package predicate_5_predicate_and_2;

import java.util.Objects;
import java.util.function.Predicate;

// https://www.geeksforgeeks.org/java-8-predicate-with-examples/

public class App5_2 {
//	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
//		@Override
//		public boolean test(String t) {
//			return t.length() > 10;
//		}
//	};
	
	public static void predicate_and(Predicate<String> nonNullPredicate, Predicate<String> hasLengthOf10) {
//		Predicate<String> nonNullPredicate = Objects::nonNull;
		
		String nullString = null;
		boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);
		System.out.println(outcome);
		
		String lengthGTThan10 = "Wellcome to the machine";
		boolean outcome2 = nonNullPredicate.and(hasLengthOf10).test(lengthGTThan10);
		System.out.println(outcome2);
	}
	
	public static void main(String[] args) {
		predicate_and(Objects::nonNull, t -> {return t.length()>10;});
	}
}
