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
public class Fibonacci {
    static void checkBelongsOrNot(int number){
        int n=number;
        int first=0,second=1,next=0;
         while (next < n)
        {
             next=first+second;
             first=second;
             second=next;
        }
        if(next == n)
        {
            System.out.println("Number belongs to Fibonacci series");
        }
        else
        {
            System.out.println("Number doesn't belongs to Fibonacci series");
        }
    }
    public static void main(String args[]){
      int n,first=0,second=1,next=0;
        Scanner sc =new Scanner(System.in);
             
                System.out.println("Enter number ");
                n = sc.nextInt();
                System.out.println("Fibonacci series is :");
                for(int i=0; i < n; i++){
                    if(i<= 1)
                        next=i;
                    else{
                        next=first+second;
                        first=second;
                        second=next;
                    }
                     System.out.print(" "+next);
                     
                }
          System.out.println();
          checkBelongsOrNot(n);
       

      
    }
}
