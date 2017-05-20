/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class PrimCheck {
     public static void main(String args[])
   {		
	
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number for check:");
	int num=scan.nextInt();
	for(int i=2;i<num;i++) //i<=num/2
	{
          
	   if(num%i==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not Prime Number");
   }
}
/*
import java.util.*;
import java.math.*;


public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
System.out.println(n.isProbablePrime(100) ? "prime" : "not prime"); 
	
   }
}
*/