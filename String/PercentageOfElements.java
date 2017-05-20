/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.text.DecimalFormat;

/**
 *
 * @author MAMUN
 */
public class PercentageOfElements {
    
        static void characterPercentage(String inputString)
    {         
        int totalChars = inputString.length();
        int upperCaseLetters = 0;    
        int lowerCaseLetters = 0;         
        int digits = 0;       
        int others = 0;

        for (int i = 0; i < inputString.length(); i++) 
        {
            char ch = inputString.charAt(i);
            
            if(Character.isUpperCase(ch))
            {
                upperCaseLetters++;
            }
            else if(Character.isLowerCase(ch))
            {
                lowerCaseLetters++;
            }
            else if (Character.isDigit(ch))
            {
                digits++;
            }
            else
            {
                others++;
            }
        }
         
        double upperPercentage = (upperCaseLetters * 100.0) / totalChars ;
        double lowerPercentage = (lowerCaseLetters * 100.0) / totalChars;
        double digitsPercentage = (digits * 100.0) / totalChars;
        double otherCharPercentage = (others * 100.0) / totalChars;
        DecimalFormat formatter = new DecimalFormat("##.###");
         
        System.out.println("In '"+inputString+"' : ");
        System.out.println("Uppercase letters are "+upperPercentage+"% ");
        System.out.println("Lowercase letters are "+formatter.format(lowerPercentage)+"%");
        System.out.println("Digits Are "+formatter.format(digitsPercentage)+"%");
        System.out.println("Other Characters Are "+formatter.format(otherCharPercentage)+"%");
        System.out.println("-----------------------------");
    }
     
    public static void main(String[] args) 
    {
        characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
    }
}

