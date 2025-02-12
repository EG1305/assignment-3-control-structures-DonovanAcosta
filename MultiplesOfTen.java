/*
*   MultiplesOfTen by Donovan Acosta
*/
public class MultiplesOfTen {
    public static void main(String[] args) { //prints multiples of 10 from 1 to 1000
        int count = 1;
        while(count<=1000){
            if(count % 100 == 0){ //checks multiple of 100 for new line
                System.out.print("" + count + "\n");
            }
            else if(count%10 == 0) { //checks multiple of 10
                System.out.print("" + count + " ");
            }
            count++;
        }
    }
}
