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
    String guess = input2.nextInt(); //Get user input
    while (guess != number) {
      int count = 0
      if (guess > number) {
        count ++
      }
      else if (guess < number) {
        count ++
      }
      else {
        System.out.println("Well done," + name + "you fund my number in" + count + "tries!")
      }
    }

  }

}
