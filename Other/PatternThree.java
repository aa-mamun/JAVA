/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class PatternThree {
    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        //Taking noOfRows value from the user
 
        System.out.println("How Many Rows You Want In Your Pyramid?");
 
        int noOfRows = sc.nextInt();
 
        //Initializing rowCount with noOfRows
 
       /*Change */ int rowCount = noOfRows; 
 
        System.out.println("Here Is Your Pyramid");
 
        //Implementing the logic
 
    /*Change */    for (int i = 0; i < noOfRows; i++)
        {
            //Printing i*2 spaces at the beginning of each row
 
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 
            //Printing j where j value will be from 1 to rowCount
 
            for (int j = 1; j <= rowCount; j++)             
            {
                System.out.print(j+" ");
            }
 
            //Printing j where j value will be from rowCount-1 to 1
             
            for (int j = rowCount-1; j >= 1; j--)
            {                 
                System.out.print(j+" ");             
            }
             
            System.out.println();
 
           
            /*Change */
            rowCount--;
        }
    }
}