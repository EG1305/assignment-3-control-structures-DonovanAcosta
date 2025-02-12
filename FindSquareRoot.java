/*
 *  FindPi by Donovan Acosta
 */
import java.util.Scanner;
public class FindSquareRoot {
    public static void main(String[] args) {
        System.out.println("This program will find the square root of a number\nEnter a positive integer");
        Scanner input = new Scanner(System.in);
        int n = -1;
        while (true) {
            if(input.hasNextInt()){ //checks to see if the input is an int
                n = input.nextInt();
                if(n > 0){// checks to see if it is a positive int
                    break;
                }            
                else{
                    System.out.println("Please enter a positive integer");
                }
            }
            else{
                System.out.println("Please enter a positive integer");
                input.next();
            }
        }
        double lastGuess = 1;
        double nextGuess;
        int iterations = 0;
        while (true) {
            nextGuess = (lastGuess + n / lastGuess) / 2; //computes next guess
            iterations++;
            
            if (Math.abs(nextGuess - lastGuess) < 0.000001) {   //breaks if next and last are approximately equal
                break;
            }
            
            lastGuess = nextGuess;  //saves to last guess
        }
        
        System.out.println("Square root of " + n + " is approximately: " + nextGuess);
        System.out.println("Iterations: " + iterations);
        input.close();
    }
}
