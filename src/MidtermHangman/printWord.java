package MidtermHangman;

public class printWord {

	/*
	 * Print word with underscore for hidden letters, returns true if underscores
	 * were printed, otherwise return false
	 */

	public static boolean printWord(String word, char[] enteredLetters) {
		boolean underscorePrinted = false;
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			// check for already entered letters from user.
			if (inEnteredletter.inEnteredLetters(letter, enteredLetters))
				System.out.print(letter); // If yes - print it
			else {
				System.out.print('_');
				underscorePrinted = true;
			}

		}
		return underscorePrinted;

	}

}
