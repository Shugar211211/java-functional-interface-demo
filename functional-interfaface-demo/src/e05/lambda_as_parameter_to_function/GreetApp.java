package e05.lambda_as_parameter_to_function;

public class GreetApp {

	public static void main(String[] args) {
		operateGreetInt(s -> System.out.println("Hello " + s));
		operateGreetInt(s -> System.out.println("Hi " + s));
	}
	
	private static void operateGreetInt(Greet greet) {
		greet.sayHello("World");
		greet.makeWish("Have a nice day");
	}
}
