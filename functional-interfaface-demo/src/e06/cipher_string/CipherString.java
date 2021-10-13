package e06.cipher_string;

@FunctionalInterface
public interface CipherString<T> {
	T codeString(T t);
}
