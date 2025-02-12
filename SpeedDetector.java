/*
*   SpeedDetector by Donovan Acosta
*/
import javax.swing.JOptionPane;
public class SpeedDetector {
    public static void main(String[] args) { //main method prompts the user to enter a speed value for a speed check
        String input;
        input = JOptionPane.showInputDialog("Enter the current speed:");
        int mph = Integer.parseInt(input);

        if(mph > 60){
            JOptionPane.showMessageDialog(null,"You are speeding. Slow down.");
        }
    }
}
