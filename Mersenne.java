import java.util.Scanner;

public class Mersenne {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number. The system will find all Mersenne primes smaller than this number.");
        
        // Validate input
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            input.next();
        }
        
        int num = input.nextInt();
        int count = 0;
        System.out.println("Mersenne primes:");
        
        // Find Mersenne primes
        for (int p = 2; (1 << p) - 1 < num; p++) {
            int mersenne = (1 << p) - 1; // 2^p - 1
            if (isPrime(mersenne)) {
                System.out.print(mersenne + "\t");
                count++;
            }
        }
        
        System.out.println("\nThere are a total of " + count + " Mersenne primes.");
        input.close();
    }
}