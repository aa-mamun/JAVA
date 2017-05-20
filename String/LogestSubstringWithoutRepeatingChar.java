/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * Java Program To Find Longest Substring Without Repeating Characters
 */
import java.util.LinkedHashMap;
import java.util.Map;
 
 public class LogestSubstringWithoutRepeatingChar 
{  
    static void longestSubstring(String inputString)
    {
        char[] charArray = inputString.toCharArray();
        String longestSubstring = null;
        int longestSubstringLength = 0;
        // LinkedHasMap is used Coz LinkedhashMap maintains insertion order wheres HashMap doesn't
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); 
        for (int i = 0; i < charArray.length; i++) 
        { // System.out.println(map);
            char ch = charArray[i];
            if(map.containsKey(ch))
            {
                i = map.get(ch);
               // System.out.println(i);
                map.clear();
            }    
            else
            {    
                
                map.put(ch, i);
            }
            //Updating longestSubstring and longestSubstringLength
            if(map.size() > longestSubstringLength)
            {
                longestSubstringLength = map.size();
               // longestSubstring = map.keySet().toString();
            }
        }
        System.out.println("Input String : "+inputString);
        System.out.print("The longest substring : "/*+longestSubstring*/);
        for(Map.Entry me : map.entrySet()){
            System.out.print(me.getKey() );
        }
        System.out.println("\nThe longest Substring Length : "+longestSubstringLength);
    }
     
    public static void main(String[] args) 
    {    
        longestSubstring("java2novice");
        System.out.println("==========================");
        longestSubstring("thelongestsubstring");
    }  
 }