/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author MAMUN
 */
public class MyStringToNumber {
 
    public static int convert_String_To_Number(String numStr){
         
        
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0';
        for(char c:numStr.toCharArray()){
            int tmpAscii = (int)c;
            //System.out.println(tmpAscii);
            sum = (sum*10)+(tmpAscii-zeroAscii);
            //System.out.println(sum);
        }
        return sum;
    }
     
    public static void main(String a[]){
         
        System.out.println("\"3256\" == "+convert_String_To_Number("3256"));
        System.out.println("\"76289\" == "+convert_String_To_Number("76289"));
        System.out.println("\"90087\" == "+convert_String_To_Number("90087"));
    }
}
