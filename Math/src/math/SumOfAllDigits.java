/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class SumOfAllDigits {
     static int sumOfAllDigitsInANumber(int  n){
      int r = 0, sum = 0;
            while (n != 0) {
                r = n % 10;
                sum = sum + r;
                n = n / 10;
            }
            return sum;
   }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = in.nextInt();
        int sum = sumOfAllDigitsInANumber(n);
         System.out.println("Sum is : " + sum);
    }
}
