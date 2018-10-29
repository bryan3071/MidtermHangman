package MidtermHangman;

public class findEmptyPosition {

	public static int findEmptyPosition(char[] enteredLetters) {
		int i = 0;
		while (enteredLetters[i] != '\u0000')
			i++;
		return i;
	}

}
