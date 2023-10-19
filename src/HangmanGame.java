import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insert the game word: ");
        String gameWord = scan.next();

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        String[] gameWordArray = gameWord.split("");

        String[] guessArray = new String[gameWord.length()];

        for (int i = 0; i < guessArray.length; i++) {
            if (guessArray[i] == null) {
                guessArray[i] = "_";
            }
        }

        System.out.println("Guess the word: ");
        System.out.println(Arrays.toString(guessArray));

        System.out.print("Insert a character: ");
        String userGuess = scan.next();

        int count = gameWord.length();
        System.out.println(count);

        for (int i = 0; i < gameWordArray.length; i++) {
            if (userGuess.equals(gameWordArray[i])) {
                guessArray[i] = userGuess;
            }
        }

        System.out.println(Arrays.toString(guessArray));


    }
}
