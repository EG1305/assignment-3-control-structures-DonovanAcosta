/*
*   GuessTheNumber by Donovan Acosta
*/
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int random = (int)(Math.random()*101); //generates a number between 1 and 100
        System.out.println("Guess a number between 1 and 100");
        int guessNum = 0, guessCount = 0;
        while (guessNum != random ) { //runs while the guess is not the right numnber
            System.out.print("Enter your guess: ");
            guessNum = input.nextInt();
            if(guessNum > random){
                System.out.println("Your guess is too high");
            }
            else{
                System.out.println("Your guess is too low");
            }
            guessCount++;
        }

        System.out.println("Yes, the number is " + random);
        System.out.println("\nYou guessed the correct number in " + guessCount + " guesses");

        input.close();

   } 
}
