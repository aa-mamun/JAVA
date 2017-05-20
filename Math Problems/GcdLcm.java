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
public class GcdLcm {
    public static void main(String args[]){
        int a,b,n1,n2,t;
        Scanner sc =new Scanner(System.in);
             
                System.out.println("Enter two numbers ");
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                
                a=n1;
                b=n2;
                while(b != 0){
                  t=b;
                  b=a%b;
                  a=t;
                  
                }
                int gcd =a;//HCF
                int lcm = (n1*n2)/gcd;
                System.out.println("GCD & LCM are respectively :" + gcd+" " + lcm);
    }  
    
}
