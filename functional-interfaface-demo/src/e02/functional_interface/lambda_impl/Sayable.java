package e02.functional_interface.lambda_impl;

@FunctionalInterface
public interface Sayable {
	
	// abstract method
	void say(String msg);
	
	// default method
	default void doIt() {
		System.out.println("Do it now");
	}
	
	// static method
	static void succeed() {
		System.out.println("Done!");
	}
}
