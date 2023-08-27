import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;


        int tryCount = 0;
        while(true) {
            System.out.println("Enter Your Number (1 to 100)");

            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("\uD83C\uDFC6 Congratulations ! You Win The Game \uD83E\uDD29");
                System.out.println("It took you " + tryCount + " Attempts ⌛");
                break;
            }
            else if(randomNumber > playerGuess) {
                System.out.println("Nope! The Number Is Higher. Try again.");
            }
            else {
                System.out.println("Nope! The Number Is Lower. Try again.");
            }
        }
        scanner.close();

    }
}
