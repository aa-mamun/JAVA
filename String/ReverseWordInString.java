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
public class ReverseWordInString {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string ");
       String str = sc.nextLine();
       String[] strArr = str.split(" ");
       String reverseString = "";
       for (int i = 0; i < strArr.length; i++) {
           String reverseWord = "";
           String word = strArr[i];
           for (int j = word.length()-1; j >= 0 ; j--) {
               reverseWord+=word.charAt(j);
           }
           reverseString+=reverseWord + " ";
           
       }
       System.out.println("Reversed words are :" + reverseString);
   }
}
