/*
 *  FindPi by Donovan Acosta
 */
import java.util.Scanner;
public class FindPi {
    public static void main(String[] args) { // allows the user to calculate pi with a set number of iteration
        System.out.println("This program will iteratively find the digits of PI using the Leibniz formula");
        System.out.println("How many iterations should we use? Please enter an integer");
        Scanner input = new Scanner(System.in);
        int iterations = -1;
        while (true) {
            if(input.hasNextInt()){ //checks to see if the input is an int
                iterations = input.nextInt();
                if(iterations > 0){// checks to see if it is a positive int
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
        double quarterPI = 0;        
        long timeNow = System.currentTimeMillis();
        int count = 0;
        while(count < iterations){
            quarterPI += (Math.pow(-1, count)/(2 * count + 1));
            count++;
        }
        double foundPI = 4 * quarterPI;
        long timeAfter = System.currentTimeMillis();
        long timeDelta = timeAfter - timeNow;

        System.out.println("PI = " + foundPI);
        System.out.println("After " + iterations + " iterations");
        System.out.println("This operation took " + timeDelta / 1000.0 + " seconds.");

        input.close();
    }
}
