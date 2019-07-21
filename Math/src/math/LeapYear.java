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
public class LeapYear {
   public static void main(String args[]){
       System.out.println("Enter a yeear");
       Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();
       if(year%4 == 0)
           System.out.println("It is a leap year");
       else if(year%100 == 0)
           System.out.println("It is a leap year");
       else if(year%400 == 0)
           System.out.println("It is a leap year");
       else
           System.out.println("It is not a leap year");
   }
}
