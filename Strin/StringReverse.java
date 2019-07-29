/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class OneStringReverse {
   public static void main(String[] args) {
       System.out.println("Enter a string");
       Scanner sc = new Scanner(System.in);
String str=sc.nextLine();
String revstring="";
 
for(int i=str.length()-1;i>=0;i--){
revstring +=str.charAt(i);
}
 
System.out.println("Reversed string is :"+revstring);
 
if(revstring.equalsIgnoreCase(str)){
System.out.println("The string is Palindrome");
}
else{
System.out.println("Not Palindrome");
}
 
}
}
