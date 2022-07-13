package gameAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MainMovie {

	public static void main(String[] args) throws Exception {

		File movieFile = new File("D:\\Automated testing\\Assignment\\movies.txt");
		BufferedReader br = new BufferedReader(new FileReader(movieFile));

		// Created string type ArrayList
		List<String> movieList = new ArrayList<>();
		List<String> guessedCharacters = new ArrayList<>();
		List<String> incorrectCharacters = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		String movies;
		String selectedMovie;
		int failCount = 0;
		String exit;

		while ((movies = br.readLine()) != null) { // readLine() used to read the line of text
			movieList.add(movies); // add method used to add the movies in movieList
			//System.out.println(movies);
		}
		br.close();

		Movie mov = new Movie();

		selectedMovie = mov.getRandomElement(movieList); // Generate a random value from the arraylist
		System.out.println("Random movie name: " + selectedMovie);
		//System.out.println("Selected Movie size: " + selectedMovie.length());

		for (int i = 0; i < selectedMovie.length(); i++) {//Converting the characters to underscore and spaces in arraylist
			if (selectedMovie.toCharArray()[i] == ' ') {
				guessedCharacters.add(i, " ");
			} else {
				guessedCharacters.add(i, "_");
			}
		}

		do {

			System.out.print("You are guessing ");
			mov.displayCorrectCharacter(guessedCharacters); // Converting List to string and displays the value

			System.out.print("\nGuess a letter:");
			String letterGuessed = sc.next();

			if (selectedMovie.contains(letterGuessed)) {
				//System.out.println("You have guessed correctly");
				char[] t = letterGuessed.toCharArray(); //Converting the character to char array and storing in variable "t"

				for (int j = 0; j < selectedMovie.length(); j++) {
					if (selectedMovie.contains(letterGuessed.toString()) && selectedMovie.charAt(j) == t[0]) {
						guessedCharacters.set(j, letterGuessed);// replacing underscore with letterGuessed character

					}
				}

				System.out.println("You have guessed (" + failCount + ") wrong letters ");
			} else {
				//System.out.println("You have guessed Incorrectly");
				incorrectCharacters.add(letterGuessed);
				failCount++;
				System.out.println(
						"You have guessed (" + failCount + ") wrong letters :" + incorrectCharacters.toString());
			}


			if (selectedMovie.equalsIgnoreCase(mov.listToStringConvert(guessedCharacters))) {
				System.out.println();
				System.out.println("You Win!");
				System.out.println("You guessed " + selectedMovie + " movie correctly");
				break;
			}

			if (failCount >= 10) {
				System.out.println(" GAME OVER ");
				break;
			} else {
				exit = sc.nextLine();
				System.out.println();

			}

		} while (exit == "");

	}

}
