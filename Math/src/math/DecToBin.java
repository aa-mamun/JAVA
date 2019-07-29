
package math;

import java.util.Scanner;

/**
 *
 * @author MAMUN
 */

public class DecToBin {

   public static  String toBinary(int n) {
       if (n == 0) {
           return "0";
       }
       String binary = "";
       while (n > 0) {
           int rem = n % 2;  // by 8 to get OCTAL
           binary = rem + binary;
           n = n / 2; // 8 to get OCTAL
       }
       return binary;
   }
   
   public static String toHexadecimal(int n){
       if (n == 0) {
           return "0";
       }
       String hex = "";
       char hexaDecimals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       while(n > 0){
           int rem = n%16;
           hex = hexaDecimals[rem] + hex;
           n= n/16;
           
       }
       return hex;
       
   }
   public static int binaryToDecimal(int binary) { 
       int decimal = 0; 
      
       int power = 0; 
       while (binary > 0) { 
           int lastDigit = binary % 10; 
           decimal += lastDigit * Math.pow(2, power); 
           power++; 
           binary = binary / 10; 
       } 
       return decimal; 
   }
   
   
   
   public static int octalToDecimal(int octal) { 
       int decimal = 0; 
      
       int power = 0; 
       while (octal > 0) { 
           int lastDigit = octal % 10; 
           decimal += lastDigit * Math.pow(8, power); 
           power++; 
           octal = octal / 10; 
       } 
       return decimal; 
   }
   
   
   static int hexTOdecimal(String s)
    {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (char c : s.toCharArray())
             {
                 
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             
             }
             return val;
    }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Binary : "+Integer.toBinaryString(5));
       System.out.println("Octal : "+Integer.toOctalString(12));
       System.out.println("Binary : "+Integer.toHexString(5));
       System.out.print("Enter a number: ");
       int decimal = scanner.nextInt();
       int m =1;
       System.out.println(m%2);
       System.out.println("Decima TO Octal : " + octalToDecimal(346));
       String binary = toBinary(decimal);
       System.out.println("The binary representation is " + binary);
       String hex = toHexadecimal(decimal);
       System.out.println("The hexadecima  is " + hex);
       int decimalFromHex = hexTOdecimal(hex);
       System.out.println("Decimal from hex "+hex +" is "+decimalFromHex);
       int decNum = binaryToDecimal(Integer.valueOf(binary));
       System.out.println("decimal of the above binary is " + decNum);

             
       
       
   }
}

// for 15 step : divide 15 by 2 = remainder 1 which will be added 15=2*7+1 ....
//: 7/2 - 1 ... 3/2 - 1  ...1 finally 1111
//1%2 = 0  1%anything=0;
//number%10 to get last digit
//1011 --> 1*2^3 + 0*2^2 + 1*2^1 + 1*2^0 = 11
                