package predicate_2_chaining;

import java.util.function.Predicate;

// https://www.geeksforgeeks.org/java-8-predicate-with-examples/

public class App {

	public static void main(String[] args) {
		
		// Creating predicate 1
		Predicate<Integer> greaterThanTen = (i) -> i>10;
		// Creating predicate 2
		Predicate<Integer> lowerThanTwenty = (i) -> i<20;
		
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);
		
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println(result2);
	}
}
