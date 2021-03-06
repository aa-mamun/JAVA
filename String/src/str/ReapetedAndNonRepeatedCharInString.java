/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str;

/**
 *
 * Java Program To Find First Repeated And Non-Repeated Character In A String
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
  
public class ReapetedAndNonRepeatedCharInString 
{    
    static void firstRepeatedNonRepeatedChar(String inputString)
    {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c, 1);
            }
        }
         
        //checking for first non-repeated character
        for (char c : strArray)
        {
            if (map.get(c) == 1)
            {
                System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+c+"'");
                break;
            }
            //checking for first repeated character
            if (map.get(c) > 1)
            {
                System.out.println("First Repeated Character In '"+inputString+"' is '"+c+"'");
               break;
            }
        } 
    }
     
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the string :");
         
        String input = sc.next();
         
        firstRepeatedNonRepeatedChar(input);
    }
}