/*
*   CoinToss by Donovan Acosta
*/
import java.util.Scanner;
public class CoinToss {
    public static void main(String[] args) { //tosses a coin based on user input 
        Scanner input = new Scanner(System.in);
        System.out.println("How many coin flips do you need?");
        int flips = -1;
        while (true) {
            if(input.hasNextInt()){ //checks to see if the input is an int
                flips = input.nextInt();
                if(flips > 0){// checks to see if it is a positive int
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

        System.out.println("Now I will toss the coin " + flips + " times.");

        int count = 0, heads = 0, tails = 0;

        while (count != flips) {
            double rand = Math.random();
            System.out.print("Toss:\t");
            if(rand > 0.5){
                System.out.println("Heads");
                heads++;
            }
            else{
                System.out.println("Tails");
                tails++;
            }
            count++;
        }
        System.out.println("Heads facing up:" + heads);
        System.out.println("Tails facing up:" + tails);
        input.close();
    }
}
