/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Arrays;

/**
 *
 * @author MAMUN
 */

public class RemoveDuplicateElements {
    public static void main(String args[]){
        int array[] = { 1,1,12,3,4,4,5,6,7 ,3};// array of ten    
        // elements
        int size = array.length;
        System.out.println("Size before deletion: " + size);
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j])
                    System.out.println(""+array[i]);
                {
                    while (j < (size - 1) )
                    {
                        array[j] = array[j + 1];// shifting the values
                        j++;
                    }   
                    size--;
                }
            }
        }
        System.out.println("Size After deletion: " + size);
        for (int k = 0; k < size; k++) 
        {
            System.out.print(" " + array[k] ); // printing the values
        }
    }
}
