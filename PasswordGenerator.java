/*
*   PasswordGenerator by Donovan Acosta
*/
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many digits do you want to use for a numeric password?");
        int size = input.nextInt();

        System.out.println("Your password is");
        for(int count = 0; count < size; count++){
            int randNum = (int)(Math.random()*10);
            System.out.print("" + randNum + " ");
        } 
        input.close();
    }
}
