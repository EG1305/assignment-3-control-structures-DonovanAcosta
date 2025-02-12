/*
*   RiceChessboard by Donovan Acosta
*/

import java.math.BigInteger;

public class RiceChessboard {
    public static void main(String[] args) {// calculates the number of rice on the 64th 
        BigInteger rice = BigInteger.ONE;
        BigInteger riceTotal = BigInteger.ZERO;
        int square = 1;
        while(square <= 64){
            System.out.println(rice + " rice on square " + square );
            rice = rice.multiply(BigInteger.TWO);
            riceTotal = riceTotal.add(rice);
            square++;
        }
        System.out.println("The total number of rice is " + riceTotal);
    }
}
