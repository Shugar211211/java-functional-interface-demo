package e06.cipher_string;

public class App {
	private static String message = 
			"Your time is limited, so don't waste it living someone else's life. \r\n"
			+ "Don't be trapped by dogma - which is living with the results \r\n"
			+ "of other people's thinking. Don't let the noise of other's opinions \r\n"
			+ "drown out your own inner voice. And most important - have the courage \r\n"
			+ "to follow your heart and intuition, they somehow already know what you \r\n"
			+ "truly want to become. Everything else is secondary. \r\n" + 
			"Stay hungry, stay foolish.";
	
	private static String operate(CipherString<String> cs, String msg) {
		return (String) cs.codeString(msg);
	}
	
	public static void main(String[] args) {
		
		CipherString<String> caesarEncode = msg -> {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<msg.length(); i++) {
				sb.append((char)((int)msg.charAt(i)+2));
			}
			return sb.toString();
		};
		
		CipherString<String> caesarDecode = msg -> {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<msg.length(); i++) {
				sb.append((char)((int)msg.charAt(i)-2));
			}
			return sb.toString();
		};
		
		String codedMsg = operate(caesarEncode, message);
		System.out.println(codedMsg);
		System.out.println();
		String decodedMsg = operate(caesarDecode, codedMsg); 
		System.out.println(decodedMsg);
	}
}
