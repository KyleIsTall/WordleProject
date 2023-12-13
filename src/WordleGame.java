import java.util.Scanner;

public class WordleGame {
    // Word to be guessed *
    // Number of attempts left *
    // Scanner object for input *
    // Constructor
    Scanner scanner = new Scanner(System.in);
    String targetWord = "apple";

    boolean gameOver = isGameOver();
    boolean isValidWord = isValidGuess();

    public WordleGame(String targetWord) {

    }

    public void playGame(){

    }

    // Method to guess the word and get feedback
    public String guessWord(String guess) {
        // Process guess and provide feedback
        // ...
        //ONLY CODE I AM HELPING WITH
        //What this for loop is doing --> Uses the charAt method to check one character from the string
        //at index i. The program provides feedback based the individual character

        String feedback = "";

        for (int i = 0; i < guess.length(); i++) {
            char letter = guess.charAt(i);

            if (letter == targetWord.charAt(i)) {
                feedback += "🟩"; // Correct letter and position
            } else if (targetWord.contains(String.valueOf(letter))) {
                feedback += "🟨"; // Correct letter, wrong position
            } else {
                feedback += "⬜"; // Incorrect letter
            }
            System.out.print(feedback);
        }
        return isWordGuessed();
    }


    // Method to check if game is over
    public boolean isGameOver() {
        boolean gameOver = false;
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                gameOver = true;
            }
        }
        return gameOver;
    }


    // Method to check if word is guessed correctly
    public boolean isWordGuessed(String guess) {
        if (guessWord().equals(targetWord)) {
            System.out.println("you win");
            gameOver = true;
            System.exit(0);
        }
        return gameOver;
    }


    // Method to validate the guess
    private boolean isValidGuess() {
        if (guessWord().length == 5 && guessWord().matches("[a-zA-Z]")) {
            isValidWord = true;
        }
        return isValidWord;
    }

}






