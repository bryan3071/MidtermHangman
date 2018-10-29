package MidtermHangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MidtermHangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int attempts = 0;
		boolean wordIsRight = false;
		
		System.out.println("Welcome to a friendly game of hangman");

		// Creates array of 10 different strings hard coded
		// Handles the generation of

		String[] Words = { "encapsulation", "polymorphism", "class", "inheritance", "superclass", "subclass",
				"abstraction", "extends", "method", "object" };
		
		

		// Handles the generation of

		Random random = new Random();
		int randomIdx = random.nextInt(Words.length);
		// System.out.println(Words[randomIdx]);
		String Gameword = (Words[randomIdx]);

		// Will remove sysout for Gameword before player plays

		// Hello is just in place for testing
		Gameword = "hello";
		// Will remove sysout for Gameword before player plays

		System.out.println(Gameword);

		// creates array that holds selected characters
		char[] enteredLetters = new char[Gameword.length()];

		do {
	        // infinitely iterate through cycle as long as enterLetter returns true
	        // if enterLetter returns false that means user guessed all the letters
	        // in the word e. g. no asterisks were printed by printWord
	        switch (enterLetter.enterLetter(Gameword, enteredLetters)) {
	            case 0:
	                attempts++;
	                break;
	            case 1:
	                attempts++;
	                break;
	            case 2:
	                break;
	            case 3:
	            	wordIsRight = true;
	                break;
	        }
	        } while ((! wordIsRight) && (attempts <= 7));
		System.out.println("You have lost");
		
		System.out.println("\nThe word is " + Gameword);
	     System.out.println (" You missed " + (attempts - findEmptyPosition.findEmptyPosition(enteredLetters)) +
	            " time(s)");
		
	}

	

}
