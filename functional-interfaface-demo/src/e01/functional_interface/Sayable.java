package e01.functional_interface;

@FunctionalInterface
public interface Sayable extends Doable{
	void say(String msg);
}
