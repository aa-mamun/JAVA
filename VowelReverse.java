
package newpackage;

import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class VowelReverse {
    public static void main (String args[]) 
        {
            String str;
            int vowel = 0;
            int consonant=0;
            int digits=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
            System.out.println("Reversed : ");
        char[] array = str.toCharArray();
        for(int i=array.length-1; i >=0; i--){
            
            System.out.print(array[i]);
        }
        // int arrayLength = array.length;
      //  System.out.format("The Java array length is %d", arrayLength);
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || 
                ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || 
                ch == 'O' || ch == 'U') {

                vowel++;
                System.out.print(ch);
            }
            else if(Character.isDigit(ch)){
				digits ++;}
            else 
                consonant++;

        }

        System.out.println("\nNumber of vowels : " + vowel);
        System.out.println("Number of consonants : " + consonant);
        System.out.println("number of digits are : " + digits);
        

    }


        }

