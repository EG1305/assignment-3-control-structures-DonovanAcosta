/*
*   PrimeCheck by Donovan Acosta
*/
import java.util.Scanner;
public class PrimeCheck {
    public static boolean isPrime(int num){ //method to check prime
        if(num < 2){
            return false;
        }
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
        
    }

    public static void main(String[] args) { //asks the user for a number till they input 0
        Scanner input = new Scanner(System.in);
        System.out.println("This program will tell you if the number entered is prime\nYou can enter 0 to end the program.");
        
        while(true){
            System.out.println("Please enter a number:");
            if (!input.hasNextInt()) {//checks if int
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next();
                continue;
            }
            int possiblePrime = input.nextInt();

            if(possiblePrime == 0){
                System.out.println("0 is not prime");
                break;
            }
            if (isPrime(possiblePrime)) {
                System.out.println(possiblePrime + " is prime");
            } else {
                System.out.println(possiblePrime + " is not prime");
            }
        }

    
        input.close();
    }
}
