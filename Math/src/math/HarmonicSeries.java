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
public class HarmonicSeries {
    public static void main(String args[]) 
    {

        int n, i=1;
        double sum = 0.0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number for length of series");
        n = in.nextInt();

        while(i <= n)
        {
             System.out.print("1/"+i+" +");
             sum = sum + (double) 1 / i;

             i++;
        }

        System.out.println("\n\nSum of Harmonic Series is "+sum); 
    }
}
