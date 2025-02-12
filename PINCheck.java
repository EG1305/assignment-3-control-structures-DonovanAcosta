/*
*   PINChecker by Donovan Acosta
*/
import java.util.Scanner;
public class PINCheck {
    public static void main(String[] args) { // Asks the user for a pin twice to confirm the user can access their "account"
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your PIN");
        int PIN1 = input.nextInt();
        while(PIN1 < 0){ //Checks for Valid PIN
            System.out.println("Invalid PIN. Try again \nEnter your PIN");
            PIN1 = input.nextInt();
        }
        int PIN2 = -1;
        System.out.println("Please confirm your PIN");
        while(PIN2 != PIN1){// checks if PINs match
            PIN2 = input.nextInt();
            if(PIN2 != PIN1){
                System.out.println("Incorrect PIN. Try again \nEnter your Pin");
            }
            else{
                System.out.println("PIN accepted. You can access your account");
            }
        }
        input.close();
    }
}
