/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MAMUN
 */
public class ThreeDuplicateCahrInString {

    static void duplicateCharCount(String inputString) {
        //Creating a HashMap containing char as key and it's occurrences as value

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        //Converting given string to char array
        char[] strArray = inputString.toCharArray();

        //checking each char of strArray
        for (char c : strArray) {
            if (map.containsKey(c)) {
                //If char is present in charCountMap, incrementing it's count by 1

                map.put(c, map.get(c) + 1);
            } else {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value

                map.put(c, 1);
            }
            
        }
        //Occurence of charecter in a string
        System.out.println(map);
        //Getting a Set containing all keys of charCountMap
        Set<Character> set = map.keySet();

        System.out.println("Duplicate Characters In " + inputString);

        //Iterating through Set 'charsInString'
        for (char ch : set) {
            if (map.get(ch) > 1) {
                //If any char has a count of more than 1, printing it's count

                System.out.println(ch + " : " + map.get(ch));
            }
        }

    }

    public static void main(String[] args) {
        duplicateCharCount("JavaJ2EE");

        duplicateCharCount("Fresh Fish");

        duplicateCharCount("Better Butter");
    }
}
