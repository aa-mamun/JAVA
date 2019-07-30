/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str;

import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class AnagramsOfWord {
    
    static int count = 0;  
    static void display(String str, String inputStr)
    {  
        if(inputStr.length()<=1)
        {
            count++;
            System.out.println(str+inputStr);
        }
        else
        {
            for(int i=0; i<inputStr.length(); i++)
            {
                String x = inputStr.substring(i, i+1);
                String y = inputStr.substring(0, i);
                String z = inputStr.substring(i+1);
                display(str+x, y+z);
            }
        }
        
    }
     
    public static void main(String args[])
    {
        
        AnagramsOfWord ob=new AnagramsOfWord();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String str = sc.next();
        System.out.println("The Anagrams are : ");
        display("",str);
        
       
        System.out.println("Total Number of Anagrams = " + count);
    }
}
