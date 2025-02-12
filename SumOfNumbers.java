/*
*   SumOfNumbers by Donovan Acosta
*/
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) { //adds numbers from 1 to a user defined number
        Scanner input = new Scanner(System.in);
        System.out.println("This program will add all the numbers from 1 to the number you enter");
        System.out.println("Please enter a number:");
        int sumTo = input.nextInt();
        int count = 1;
        int sum = 0;
        while (count <= sumTo) {
            sum += count;
            count++;
        }
        System.out.println("The sum of all numbers from 1 to " + sumTo + " is " + sum);
        
        input.close();
    }
}
