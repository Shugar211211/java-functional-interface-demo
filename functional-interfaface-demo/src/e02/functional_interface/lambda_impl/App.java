package e02.functional_interface.lambda_impl;

public class App {
	public static void main(String[] args) {
		
		// lambda expression
		Sayable sam = (String msg)->System.out.println(msg);
		
		// lambda expression call
		sam.say("Hello there!");
		
		// default function call
		sam.doIt();
		
		// static function call
		Sayable.succeed();
	}
}
