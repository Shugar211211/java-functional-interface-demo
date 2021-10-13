package e05.lambda_as_parameter_to_function;

@FunctionalInterface
public interface Greet {
	public void sayHello(String name);
	default void makeWish(String wish) {
		System.out.println(wish);
	}
}
