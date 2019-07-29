 /*
 The key point here is that from the mid of any palindrome, if we go to right and left by 1 place, 
it’s always same character. For example 12321, here mid is 3 and if we keep moving one position in both sides, 
we get 2 and then 1.We will use the same logic in our java program to find out the longest palindrome.
However if the palindrome length is even, the mid size is also even, so we need to make sure in our program 
that this is also checked, for example 12333321, here mid is 33 and if we keep moving one position in both sides,
we get 3, 2 and 1.

In our java program, we will iterate over the input string with mid as 1st place and checking the 
right and left character. We will have two global variables to save the start and end position for
palindrome. We also need to check if there is already a longer palindrome found since there can we 
multiple palindrome in the given string.
 */
package newpackage;
  
/**
 *
 * @author MAMUN
 */
public class LongestPalindromeFinder {

    public static void main(String[] args) {
        System.out.println(longestPalindromeString("amadambccd"));
        System.out.println(longestPalindromeString("12321"));
        System.out.println(longestPalindromeString("9912321456"));
        System.out.println(longestPalindromeString("9912333321456"));
        System.out.println(longestPalindromeString("12145445499"));
        System.out.println(longestPalindromeString("1223213"));
        System.out.println(longestPalindromeString("abcdef"));
    }

    static public String longestPalindromeWithSpecifiedParameter(String s, int left, int right) {
        if (left > right) {
            return null;
        }
        /*
      * left will decrement and move towards start of string until it reaches start.
         * right will increment and move towards end of string until it reaches end.
      * And any left and right reaches destination (i.e. start and end respectively)
      * at any point method will return.
      */
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
             /*
                * proceed only if character at left and right are equal
                * Example - String is "baab", left is 1 (i.e. a) and right is 2 (i.e. a)
                *         As left and right are equal we can proceed by entering while loop.
                */
            left--;
            right++;
        }
        /*
            * return 
            * Example - String is "abcd", left is 1 (i.e. b) and right is 2 (i.e. c)
            *         As left and right are NOT equal
            *         return "abcd".substring(2, 2) =  "" OR blankString
            */
        return s.substring(left + 1, right);
    }

    // O(n^2)
    public static String longestPalindromeString(String s) {
        if (s.equals("")) {
            return null;
        }
        String longest = s.substring(0, 1);
        for(int i = 0; i < s.length() - 1; i++) {
            //odd cases like 121
            String palindrome = longestPalindromeWithSpecifiedParameter(s, i, i);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
            //even cases like 1221
            palindrome = longestPalindromeWithSpecifiedParameter (s, i, i + 1);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
        }
        return longest;
    }

}
