package gameAssignment;

import java.util.List;
import java.util.Random;

public class Movie {

	// Generate a value from the ArrayList
	public String getRandomElement(List<String> movieList) {
		Random rand = new Random();

		return movieList.get(rand.nextInt(movieList.size()));
	}

	public void displayCorrectCharacter(List<String> guessedCharacters) {
		for (String x : guessedCharacters)
			System.out.print(x);

	}

	public String listToStringConvert(List<String> guessedCharacters) {
		String listToStringConvertGuessedCharacter = "";
		for (String s : guessedCharacters) {
			listToStringConvertGuessedCharacter = listToStringConvertGuessedCharacter + s;
		}
		return listToStringConvertGuessedCharacter;

	}

}