import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nInsert the theme of the game word! ");
        System.out.print("Player 1 > ");
        String themeOfTheGameWord = scan.nextLine();

        System.out.println("\nInsert the game word! ");
        System.out.print("Player 1 > ");
        String gameWord = scan.nextLine();
        gameWord = gameWord.toLowerCase();

        System.out.println("\nGive a hint! ");
        System.out.print("Player 1 > ");
        String wordHint = scan.nextLine();

        String[] gameWordArray = gameWord.split("");
        String[] guessArray = new String[gameWord.length()];

        for (int i = 0; i < guessArray.length; i++) {
            if (guessArray[i] == null) {
                guessArray[i] = "_";
            }
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        int count = 6;
        System.out.println("The theme of the game word is " + themeOfTheGameWord + "\nYou have \u001B[1mONLY\u001B[0m " + count + " attempts!");
        while (count > 0 && !Arrays.equals(gameWordArray, guessArray)) {

            System.out.println("\nGuess the word: ");
            System.out.println(Arrays.toString(guessArray));
            System.out.println("\nInsert a character!");
            System.out.print("Player 2 > ");
            String userGuess = scan.next();
            userGuess = userGuess.toLowerCase().replaceAll("([^A-z0-9])\\w+", "");

            boolean verifyCharInWord = false;

            for (int i = 0; i < gameWordArray.length; i++) {
                if (userGuess.equals(gameWordArray[i])) {
                    guessArray[i] = userGuess;
                    verifyCharInWord = true;
                }
            }


            if (!verifyCharInWord) {
                if (count == 2) {
                    count--;
                    System.out.println("\n\u001b[31mThat character doesn't exist in the word! \nThis is your last chance to guess the word!\u001b[0m");
                    System.out.println("\n\u001b[33;1mHere is a hint: " + wordHint + "\u001b[0m");
                }else if (count == 3) {
                    count--;
                    System.out.println("\nThat character doesn't exist in the word! \nRemaining attempts: " + count);
                    System.out.println("\n\u001b[33;1mHere is a hint: " + wordHint + "\u001b[0m");
                } else {
                    count--;
                    System.out.println("\n\u001b[31mThat character doesn't exist in the word! \nRemaining attemps: " + count +"\u001b[0m");
                }
            }
        }

        System.out.println(Arrays.toString(guessArray));

        if (Arrays.equals(gameWordArray, guessArray)){
            System.out.println("\n\u001b[32;1mNice you guessed the word: " + gameWord + "\u001b[0m 🎉");
        }   else {
            System.out.println("\n\u001b[31mYou ran out of attemps. The correct word was: " + gameWord +"\u001b[0m 🥲");
        }
    }
}
