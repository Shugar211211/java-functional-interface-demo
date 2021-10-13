package e07.consumer;

import java.util.function.Consumer;

// https://www.javainterviewpoint.com/java-consumer-example/

public class PrintInputApp {
	public static void main(String[] args) {
		Consumer<String> printer = str -> System.out.println(str);
		printer.accept("Wellcome");
		printer.accept("JavaInterviewPoint");
	}
}
