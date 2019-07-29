/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author MAMUN
 */

import java.util.StringTokenizer;  
public class Tokenizer{  
 public static void main(String args[]){  
     // it is deprected now coz regex does not work here
   StringTokenizer st = new StringTokenizer("my 'sdf'name12 is khan","\\s");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  