
package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 Reverse The String With Preserving The Position Of Spaces :
 */
public class ReverseStringKeepingSpaceFixedInPos {
    public static void main(String[] arr ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine();
        
        char[] strArr = str.toCharArray();
        char[] resultArr = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            if(strArr[i] == ' '){
                resultArr[i] = ' ';
            }
        }
        int resultArrLength = resultArr.length-1;
        
        for (int i = 0; i < str.length(); i++) {
            if(strArr[i] != ' '){
                if(resultArr[resultArrLength] == ' '){
                    resultArrLength--;
                }
                resultArr[resultArrLength] = strArr[i];
                resultArrLength--;
                
            }
        }
        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i]);
        }
        
    }
}
