/*
*   RockPaperScissors by Donovan Acosta
*/
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) { //Lets the user play RPS with a computer
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Scissors (0), Rock (1), Paper(2):");
        int human = input.nextInt();  
        
        while(human < 0 || human > 2){  //checks for valid input
            System.out.println("Please enter a valid option. Enter Scissors (0), Rock (1), Paper(2):");
            human = input.nextInt();
        }
        int computer = (int)(Math.random() * 3); //computer is restricted to values 0-22
        
        if (human == computer){
            System.out.println("Tie");
        }
        else if(human == 0 & computer == 1){
            System.out.println("You Lose: Rock beats scissors");
        }
        else if(human == 0 && computer == 2){
            System.out.println("You Win: Scissors beat paper");
        }
        else if(human == 1 && computer == 0 ){
            System.out.println("You Win: Rock beats scissors");
        }
        else if(human == 1 && computer == 2){
            System.out.println("You Lose: Paper beats rock");
        }
        else if(human == 2 & computer == 0){
            System.out.println("You Lose: Scissors beats paper");
        }
        else if(human == 2 && computer == 1){
            System.out.println("You Win: Paper beats rock");
        }

        input.close();
    }
}
