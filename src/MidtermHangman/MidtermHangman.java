package MidtermHangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MidtermHangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Attempts = 0;

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
		// char[] lettersSelected = new char[Words[randomWordNumber].length()];

	}

}
