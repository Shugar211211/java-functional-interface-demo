package e10.consumer.for_each;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// https://www.javainterviewpoint.com/java-consumer-example/

public class PrintListForEach {
	public static void main(String[] args) {
		Consumer<String> printer = str -> System.out.println(str);
		List<String> countryList = Arrays.asList("India", "Australia", "France", "Canada");
		countryList.stream().forEach(printer);
	}
}
