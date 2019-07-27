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
//Euclidean Algorithm of 
// Greatest common divisor (GCD) or 
//Highest common factor (HCF)
//This algorithm finds GCD by performing repeated division starting from the two numbers we want to
// find the GCD of until we get a remainder of 0.
//
//For our example, 24 and 60, below are the steps to find GCD using Euclid's algorithm.
//
//Divide the larger number by the small one. In this case we divide 60 by 24 to get 
//a quotient of 2 and remainder of 12.
//Next we divide the smaller number (i.e. 24) by the remainder from the last division (i.e. 12).
// So 24 divide by 12, we get a quotient of 2 and remainder of 0.
//Since we already get a remainder of zero, the last number that we used to divide is the GCD, i.e 12.
//Let's look at another example, find GCD of 40 and 64.
//
//64 ÷ 40 = 1 with a remainder of 24
//40 ÷ 24 = 1 with a remainder of 16
//24 ÷ 16 = 1 with a remainder of 8
//16 ÷ 8 = 2 with a remainder of 0.
//We stop here since we've already got a remainder of 0. 
//The last number we used to divide is 8 so the GCD of 40 and 64 is 8
// LCM(a,b)=a*b/GCD(a,b)
public class GcdLcm {
    public static void main(String args[]){
        int a,b,n1,n2,t;
        Scanner sc =new Scanner(System.in);
             
                System.out.println("Enter two numbers ");
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                
                a=n1;
                b=n2;
                while(b != 0){
                  t=b;
                  b=a%b;
                  a=t;
                  
                }
                int gcd =a;//HCF
                int lcm = (n1*n2)/gcd;
                System.out.println("GCD & LCM are respectively :" + gcd+" " + lcm);
    }  
    
}
