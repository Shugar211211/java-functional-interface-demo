package e01.functional_interface;

public class SayableImpl implements Sayable {
	
	public void say(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		SayableImpl sam = new SayableImpl();
		sam.say("Hello");
		sam.doIt();
	}
}
