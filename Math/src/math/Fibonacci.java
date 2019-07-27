                  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class Fibonacci {
    
    public static void main(String args[]){
      int n,first=0,second=1,next=0;
        Scanner sc =new Scanner(System.in);
             
                System.out.println("Enter limit of series ");
                n = sc.nextInt();
                System.out.println("Fibonacci series is:");
                for(int i=0; i <n; i++){
                    if(i<= 1)
                        next=i;
                    else{
                        next=first+second;
                        first=second;
                        second=next;
                    }
                     System.out.print(" "+next);
                      
                }
                if(next == n)
                {
                    System.out.println("\nNumber belongs to Fibonacci series");
                }
                else
                {
                    System.out.println("\nNumber doesn't belongs to Fibonacci series");
                }
        
         
         
    }

      
    }

