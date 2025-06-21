package Tasks.Test;

public class CodingQuestion_15 {
    public static void main(String[] args) {
        /*
        Prime Number Finder
Write a program to find and print all prime numbers between 1 and 100 using loops.

**Requirements:**
- Use nested loops to check for prime numbers
- A prime number is divisible only by 1 and itself
- Print all prime numbers in the range 1-100
- Optimize the algorithm for better performance
         */

        System.out.println("Prime numbers between 1 and 100:");

        for (int num = 2; num <= 100; num++) {  // Start from 2, since 1 is not prime
            boolean isPrime = true;

            // Check divisibility up to sqrt(num)
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;  // Not a prime
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
