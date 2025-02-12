/*
*   SpeedDetector2 by Donovan Acosta
*/

import javax.swing.JOptionPane;

public class SpeedDetector2 {
    public static void main(String[] args) { //Checks the user's speed and conrgatulates them if under 60 mph
        String input;
        input = JOptionPane.showInputDialog("Enter the current speed:");
        int mph = Integer.parseInt(input);

        if(mph > 60){
            JOptionPane.showMessageDialog(null,"You are speeding. Slow down.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Congratulations! You are a safe driver.");
        }
    }
}
