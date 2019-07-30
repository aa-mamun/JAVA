/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str;

import java.util.Arrays;
import java.util.Scanner;
/** 
 * An anagram of a string is another string that contains same characters, 
 * only the order of characters can be different. 
 * For example, “abcd” and “dabc” are anagram of each other.
 */
/**
 *
 * @author MAMUN
 */
/*public class AngramCheck {
    
    static void anagramCheck(String s1 ,String s2){
        String strOne = s1.replaceAll("\\s", "");
        String strTwo = s2.replaceAll("\\s", "");
        
        boolean status = true;
        
        if(strOne.length() != strTwo.length()){
            status = false;
        }
        else{
            char[] chArrOne = strOne.toLowerCase().toCharArray();
            char[] chArrTwo = strTwo.toLowerCase().toCharArray();
            
            Arrays.sort(chArrOne);
            Arrays.sort(chArrTwo);
            
            status = Arrays.equals(chArrOne, chArrTwo);
            
        }
       if(status){
           System.out.println(s1 + " " +  s2 + " are anagram");
       }
       else{
           System.out.println("NOT Anagram");
       }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two string ");
        String strOne = sc.nextLine();
        String strTwo = sc.nextLine();
        
        anagramCheck(strTwo, strTwo);
        
    }
}*/

 import java.util.*;
class Solution{
	static String sort(String s){
		char[] a=s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		String a=cin.next(),b=cin.next();
		System.out.println(sort(a.toLowerCase()).equals(sort(b.toLowerCase())) ? "Anagrams" : "Not Anagrams");
	}
}
 
/* 
 import java.io.*;
import java.util.*;

 class Solution {
 static boolean isAnagram(String a, String b) {
    
        
        return sort(a).equals(sort(b)) ? true : false ;
        
    }
static String sort(String s){
    s = s.toLowerCase();
    char[] chArr = s.toCharArray();
    Arrays.sort(chArr);
    return new String(chArr);
}
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
*/
 