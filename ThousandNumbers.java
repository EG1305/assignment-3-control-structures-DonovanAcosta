/*
*   ThousandNumbers by Donovan Acosta
*/
public class ThousandNumbers {
    public static void main(String[] args) { //prints the numbers from 1 to 1000
        int count = 1;
        while(count<=1000){
            if(count % 10 == 0){ //checks multiple of 10 for new line
                System.out.print("" + count + "\n");
            }
            else{
                System.out.print("" + count + " ");
            }
            count++;
        }
    }
}
