/*
*   Sumation by Donovan Acosta
*/
import java.util.Scanner;
public class Summation {
    public static void main(String[] args) {//sums the numbers entered by the user
        System.out.println("This program will add all the numbers you enter\nEnter 0 to stop adding:");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int nextNum;
        while((nextNum = input.nextInt())!=0){
            sum += nextNum;
            System.out.println("You entered " + nextNum);
            System.out.println("The sum is " + sum);
        }
        System.out.println("The sum of all the numbers entered is " + sum);

        input.close();
    }
}
