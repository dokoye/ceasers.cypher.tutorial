package ceasars.cypher;

public class Main {

	public static void main(String[] args) {
		
		String message = "how are you doing today?";
		int offset = 12;
		// TODO Auto-generated method stub
		CeasarsCypher mainCipher = new CeasarsCypher();
		String cipheredMessage = mainCipher.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);
	}

}
