/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class ToggledString {
    public static void main(String[] args) {
        System.out.println("Enter a string to Toggle it's case");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        StringBuffer sb = new StringBuffer(str.length());//ensuring by string's length which is by default 16
        if( str.equals("") || str.length()== 0){
            return ;
        }
        else{
            for(char ch : str.toCharArray()){
                if(Character.isUpperCase(ch)){
                    ch =Character.toLowerCase(ch);
                }
                else if(Character.isLowerCase(ch)){
                    ch = Character.toUpperCase(ch);
                }
                sb.append(ch);
                
            }
            System.out.println(sb);
        }
    }
}
