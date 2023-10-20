import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insert the theme of the game word: ");
        String themeOfTheGameWord = scan.nextLine();

        System.out.print("Insert the game word: ");
        String gameWord = scan.next();


        String[] gameWordArray = gameWord.split("");
        String[] guessArray = new String[gameWord.length()];

        for (int i = 0; i < guessArray.length; i++) {
            if (guessArray[i] == null) {
                guessArray[i] = "_";
            }
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        int count = 6;
        System.out.println("The theme of the game word is " + themeOfTheGameWord + "\nYou have ONLY " + count + " attempts\n");
        while (count > 0 && !Arrays.equals(gameWordArray, guessArray)) {


            System.out.println("Guess the word: ");
            System.out.println(Arrays.toString(guessArray));
            System.out.print("Insert a character: ");
            String userGuess = scan.next();

            boolean verifyCharInWord = false;

            for (int i = 0; i < gameWordArray.length; i++) {
                if (userGuess.equals(gameWordArray[i])) {
                    guessArray[i] = userGuess;
                    verifyCharInWord = true;
                }
            }


            if (!verifyCharInWord) {
                count--;
                System.out.println("\n That character doesn't exist in the word! \nRemaining attempts: " + count);
            }
        }
        System.out.println(Arrays.toString(guessArray));

        if (Arrays.equals(gameWordArray, guessArray)){
            System.out.println("\nNice you guessed the word: " + gameWord);

        }   else {
            System.out.println("\nYou ran out of attemps. The correct word was: " + gameWord);
        }




    }
}
