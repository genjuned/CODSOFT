package NumberGuessingGame;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

  public static void main(String[] args) {

    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    int randomNumber = rand.nextInt(100) + 1;
    //System.out.println("Random number is " + randomNumber);

    int tryCount = 0;
    while(true) {
      System.out.println("Enter your guessed Number (1-100):");

      int playerGuess = scanner.nextInt();
      tryCount++;

      if (playerGuess == randomNumber) {
        System.out.println("Awesomr you guessed the right!");
        System.out.println("It took you " + tryCount + " tries");
        break;
      }
      else if(randomNumber > playerGuess) {
        System.out.println("Nope! The number is higher than the Guess  try again.");
      }
      else {
        System.out.println("Nope! The number is lower than the Guess try again.");
      }
    }



    scanner.close();

  }
}
 