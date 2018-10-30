package MidtermHangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MidtermHangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int attempts = 0;
		boolean wordIsRight = false;

		System.out.println("Welcome to a friendly game of Hangman");

		// Creates array of 10 different strings hard coded
		

		String[] Words = { "encapsulation", "polymorphism", "class", "inheritance", "superclass", "subclass",
				"abstraction", "extends", "method", "object" };

		// Handles the generation of the random value

		Random random = new Random();
		int randomIdx = random.nextInt(Words.length);
		String Gameword = (Words[randomIdx]);

		
		// creates array that holds selected characters
		char[] enteredLetters = new char[Gameword.length()];

		do {
			// infinitely iterate through cycle as long as enterLetter returns true
			// if enterLetter returns false that means user guessed all the letters
			// in the word e. g. no asterisks were printed by printWord
			switch (enterLetter.enterLetter(Gameword, enteredLetters, attempts)) {
			// missed letter
			case 0:
				attempts++;
				break;
			//correct letter
			case 1:
				attempts++;
				break;
			// if a character is repeated
			case 2:
				break;
			//Print word with underscore for hidden letters, returns true if underscores
				//were printed, otherwise return false
			case 3:
				wordIsRight = true;
				break;
			}
		} while (!wordIsRight);
		System.out.println("\nThe word is " +  Gameword + " You missed "
				+ (attempts - findEmptyPosition.findEmptyPosition(enteredLetters)) + " time(s)");

	}

}
