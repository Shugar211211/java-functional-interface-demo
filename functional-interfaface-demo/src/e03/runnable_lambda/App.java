package e03.runnable_lambda;

public class App {

	public static void main(String[] args) {
		
		// Create new thead
		Thread newThread = new Thread( () -> System.out.println("New thread created") );
		newThread.run();
		
		// Create new thead, another way
		new Thread( () -> {System.out.println("One more new thead created");} ).start();;
	}
}
