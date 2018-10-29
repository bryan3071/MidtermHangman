package MidtermHangman;

public class inEnteredletter {

	public static boolean inEnteredLetters(char letter, char[] enteredLetters) {
		return new String(enteredLetters).contains(String.valueOf(letter));
	}

}
