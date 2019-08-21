/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathclass;

/**
 *
 * @author MAMUN
 */
import java.math.*;

public class GCD {

public static void main(String[] args) {

        // create 3 BigInteger objects
	BigInteger bi1, bi2, bi3;

	// assign values to bi1, bi2
	bi1 = new BigInteger("18");
	bi2 = new BigInteger("24");

	// assign gcd of bi1, bi2 to bi3
	bi3 = bi1.gcd(bi2);
        

	String str = "GCD of " + bi1 + " and " + bi2 + " is " +bi3;

	// print bi3 value
	System.out.println( str );
        
        bi3 = bi1.divide(new BigInteger("3")); 
        System.out.println( "Division result is " +bi3 );
    }
}