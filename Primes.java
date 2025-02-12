/*
 *  Primes by Donovan Acosta
 */
import java.util.Scanner;

public class Primes {
    public static boolean isPrime(int num) {// Method to check if a number is prime
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will tell you if the number entered is prime\nYou can enter 0 to end the program.");
        
        while(true){
            System.out.println("Please enter a number:");
            //checks if int
            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next();
                continue;
            }
            int num = input.nextInt();

            int count = 0;
            for (int i = 2; i < num; i++) {
                if (isPrime(i)) {
                    //formatting
                    System.out.print(i + "\t");
                    if(count != 0 && count % 9 == 0){
                        System.out.println();
                    }
                    count++;
                }
            }
            System.out.println("\nThere are a total of " + count + " prime numbers");
            break;
        }
    
        input.close();
    }
}
