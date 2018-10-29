package MidtermHangman;

import java.util.Scanner;

public class enterLetter {

	public static int enterLetter(String word, char[] enteredLetters, int miss) {
		System.out.print("(Guess) Enter a letter in word ");
		// If-clause is true if no asterisks were printed so
		// word is successfully guessed
		if (!printWord.printWord(word, enteredLetters))
			return 3;
		System.out.print(" > ");
		Scanner input = new Scanner(System.in);
		int emptyPosition = findEmptyPosition.findEmptyPosition(enteredLetters);
		char userInput = input.nextLine().charAt(0);
		if (inEnteredletter.inEnteredLetters(userInput, enteredLetters)) {
			System.out.println(userInput + " is already in the word");
			return 2;
		} else if (word.contains(String.valueOf(userInput))) {
			enteredLetters[emptyPosition] = userInput;
			return 1;
		} else {
			miss++;
			System.out.println(userInput + " is not in the word. Misses = " + miss);
			return 0;
		}
	}

}
