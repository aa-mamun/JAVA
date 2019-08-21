/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathclass;

/**
 *
 * @author MAMUN
 * */
import java.math.*;

public class BigIntegerDemo {

   public static void main(String[] args) {

	// create 4 BigInteger objects
	BigInteger bi1, bi2, bi3, bi4,bi5,bi6;  

	// assign values to bi1, bi2
	bi1 = new BigInteger("123");
	bi2 = new BigInteger("-123");
        bi5 =new BigInteger("50");

	// assign absolute values of bi1, bi2 to bi3, bi4
	bi3 = bi1.abs();
	bi4 = bi2.abs();
	  
	String str1 = "Absolute value of " + bi1 + " is " + bi3;
	String str2 = "Absolute value of " + bi2 + " is " + bi4;

	// print bi3, bi4 values
	System.out.println( str1 );
	System.out.println( str2 );
        
        bi6=bi1.add(bi5);
        System.out.println( "Result is "   +bi6 );
   }
}