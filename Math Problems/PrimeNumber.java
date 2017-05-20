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




public class PrimeNumber {
       
    public static void main(String[] args) {
             PrimeNumber pn =new PrimeNumber();
           
             
                Scanner sc =new Scanner(System.in);
             
                System.out.println("Enter the limit");
                int n = sc.nextInt();
                System.out.println("Prime numbers between 1 and " + n);
                for(int i=2; i < n; i++){    
                 boolean isPrime = true;
                 //check to see if the number is prime
                 for(int j=2; j < i ; j++){  
                                if(i % j == 0){
                                        isPrime = false;
                                        break;
                                }
                        }
                        // print the number
                        if(isPrime)
                                System.out.print(i + " ");
                }
                
        }
}
