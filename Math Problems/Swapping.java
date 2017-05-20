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
public class Swapping {
    public static void main(String[] args) {
       int a,b,temp;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter two numbers: ");
       a=sc.nextInt();
       b=sc.nextInt();
       
//       temp = a;
//       a = b;
//       b = temp;
//       System.out.println("After swapping using temporary varible " + a + b);
//       
//       a=a+b;
//       b=a-b;
//       a=a-b;
       
       
       
       /*
       
      
 
    /****first method using third variable

 
    /****second method without using third variable
   
 
    /****Third method  using X-Or 
    a^=b;
    b^=a;
    a^=b;
  
 
    */ //fourth method  (single statement)
    a=a+b-(b=a);
   
 System.out.println("After swapping without using third variable : " + a + " " + b);
 
       
       
    
        System.out.println("Enter First String :");
        String s1 = sc.next();
        System.out.println("Enter Second String :");
        String s2 = sc.next();
        System.out.println("Before Swapping :");
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
        //Swapping starts
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length());  
        //Swapping ends
         
        System.out.println("After Swapping :"); 
        System.out.println("s1 : "+s1); 
        System.out.println("s2 : "+s2);
    
    }
}
