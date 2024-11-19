import java.util.Scanner;

public class Game {

    private int number;
    private int guesses;
    private int mode;
    private Player player;

    private void setGameMode(String choice) {
        if (choice.equalsIgnoreCase("h")) {
            guesses = 5;
            mode = 2;
        } else if (choice.equalsIgnoreCase("m")) {
            guesses = 7;
            mode = 1;
        } else {
            guesses = 10;
            mode = 0;
        }
    }

    private void chooseRandomNo() {
        number = (int) (Math.random() * 100);
    }

    private boolean evalGuess(String guess) {
        --guesses;
        int intGuess = Integer.parseInt(guess);
        if (intGuess == number) {
            System.out.println("Correct");
            player.addScore(guesses+1, mode);
            return true;
        } else if (intGuess > number) {
            System.out.println("Go lower");
        } else {
            System.out.println("Go higher");
        }
        return false;
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! What is your name? ");
        player.setName(scanner.nextLine());

        boolean keepPlaying = true;
        while (keepPlaying) {

            System.out.print("Would you like to play in easy, medium or hard mode? (e/m/h): ");
            setGameMode(scanner.nextLine());

            chooseRandomNo();

            boolean guessed = false;
            while (guesses > 0 && !guessed) {
                System.out.print("I have selected a number between 1 and 100. Guess! ");
                guessed = evalGuess(scanner.nextLine());
            }

            player.displayScores();

            System.out.println("Would you like to play again? (y/n): ");
            if (scanner.nextLine().equalsIgnoreCase("n")) {
                keepPlaying = false;
            }
        }
    }

    public Game() {
        player  = new Player();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}