package e01.functional_interface;

public interface Doable {
	default void doIt() {
		System.out.println("Do it now");
	}
}
