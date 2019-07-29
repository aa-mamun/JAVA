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
public class ReomoveWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine();
        
        System.out.println(str.replaceAll("\\s",""));
        
        StringBuffer sb = new StringBuffer();
        char[] chArr = str.toCharArray();
        for(char c : str.toCharArray()){
            if(c != ' ' && c != '\t'){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
