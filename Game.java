/*

A number-guessing game.

*/
import java.util.Scanner;
import java.util.Random;


public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Howdy, what's your name?");

    String name = input.nextLine(); // Get user input
    System.out.println(name + ", I'm thinking of a number between 1 and 100.");
    System.out.println("Try to guess my number.");

    Random rand = new Random();
    int number = rand.nextInt(100);

    Scanner input2 = new Scanner (System.in);
    System.out.println("Your Guess?");
    int guess = input2.nextInt(); //Get user's 1st guess
    int count = 0;
    while (guess != number) {

      if (guess > number) {
        System.out.println("Your guess is too high, try again.");
        System.out.println("Your Guess?");
         guess = input2.nextInt();
        count ++;
      }
      else if (guess < number) {
        System.out.println("Your guess is too low, try again.");
        System.out.println("Your Guess?");
        guess = input2.nextInt();
        count ++;
      }

    }
    System.out.println("Well done, " + name + " you found my number in " + count + " tries!");
  }

}
