
import java.util.Scanner;

public class PalindromeAdder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        long number = scanner.nextLong(); // Use long to handle potentially large numbers

        System.out.println(number); // Print the initial number as per example

        long currentNumber = number;
        int iterations = 0; // Optional: track iterations

        while (!isPalindrome(String.valueOf(currentNumber))) {
            long reversedNumber = reverseNumber(currentNumber);
            long sum = currentNumber + reversedNumber;

            System.out.println(currentNumber + " + " + reversedNumber + " = " + sum);

            currentNumber = sum;
            iterations++;

            // Optional: Add a safety break for extremely long sequences
            if (iterations > 1000) {
                System.out.println("Stopped after " + iterations + " iterations to prevent infinite loop. Palindrome not found.");
                break;
            }
        }

        if (isPalindrome(String.valueOf(currentNumber))) {
            System.out.println("Palindrome found: " + currentNumber);
        }

        scanner.close();
    }

    /**
     * Checks if a given string is a palindrome.
     * A string is a palindrome if it reads the same forwards and backwards.
     *
     * @param str The string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    /**
     * Reverses the digits of a given long number.
     *
     * @param num The number to reverse.
     * @return The reversed number.
     */
    public static long reverseNumber(long num) {
        long reversedNum = 0;
        long temp = num;
        while (temp != 0) {
            long digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            temp /= 10;
        }
        return reversedNum;
    }
}