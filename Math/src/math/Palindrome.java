package math;

import java.util.Scanner;

/**
 * Reverse And Add A Number Until You Get A Palindrome?
 *
 * Take number from the user, reverse it and add it to itself. If the sum is not
 * a palindrome then repeat the procedure until you get a palindrome. For
 * example, If 7325 is input number, then 7325 (Input Number) + 5237 (Reverse Of
 * Input Number) = 12562 12562 + 26521 = 39083 39083 + 38093 = 77176 77176 +
 * 67177 = 144353 144353 + 353441 = 497794 (Palindrome) In this particular case,
 * we got a palindrome (497794) after 5th addition. This method gives palindrome
 * in few steps for almost all of the integers.
 */
public class Palindrome {

    static int reverseNumber(int n) {
        int reverse = 0, rem = 0;
        while (n != 0) {
            rem = n % 10;
            reverse = (reverse * 10) + rem;
            n = n / 10;
        }
        return reverse;
    }
    
    static boolean checkPalindrome(int n) {
        int reverse = reverseNumber(n);
        if (reverse == n) {
            return true;
        } else {
            return false;
        }
    }

    static void reverseAndAdd(int n) {
        if (checkPalindrome(n)) {
            System.out.println("Given number is already a palindrome ");
        } else {
            while (!checkPalindrome(n)) {
                int reverse = reverseNumber(n);
                int sum = n + reverse;
                System.out.println(n + " + " + reverse + " = " + sum);
                n = sum;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        reverseAndAdd(n);
    }
}
