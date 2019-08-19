/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 *
 * @author MAMUN
 */

public class RemoveDuplicateElements {
    public static void main(String args[]){
        int array[] = { 1, 2, 5, 1, 7, 2, 4, 2 };// array of ten    
    
        
       
        removeDuplicates(array); 
        
        Arrays.sort(array);
        int n = array.length;        
        n = removeDuplicates(array, n); 
        for (int i=0; i<n; i++) 
           System.out.print(array[i]+" "); 
    }
    
    //using LinkedhashSet
     public static void removeDuplicates(int[] arr) 
    { 
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(); 
        // adding elements to LinkedHashSet 
        for (int i = 0; i < arr.length; i++) 
            set.add(arr[i]); 
  
        System.out.println("\nAfter removing duplicate elemnts"+set); 
    } 
     

 // Method 1: (Using extra space)
    /**
    *Create an auxiliary array temp[] to store unique elements.
    *Traverse input array and one by one copy unique elements of
    * array[] to temp[]. Also keep track of count of unique elements. Let this count be j.
    *Copy j elements from temp[] to array[] and return j
    */
       static int removeDuplicatesTwo(int arr[], int n) 
    { 
        // Return, if array is empty 
        // or contains a single element 
        if (n==0 || n==1) 
            return n; 
       
        int[] temp = new int[n]; 
          
        // Start traversing elements 
        int j = 0; 
        for (int i=0; i<n-1; i++) 
            // If current element is not equal 
            // to next element then store that 
            // current element 
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i]; 
          
        // Store the last element as whether 
        // it is unique or repeated, it hasn't 
        // stored previously 
        temp[j++] = arr[n-1];    
          
        // Modify original array 
        for (int i=0; i<j; i++) 
            arr[i] = temp[i]; 
        
        return j; 
    } 
    
    
    /**
    *Method 2: (Constant extra space)
     Just maintain a separate index for same array 
     * as maintained for different array in Method 1.
    */
       static int removeDuplicates(int arr[], int n) 
    { 
        if (n == 0 || n == 1) 
            return n; 
        // To store index of next unique element 
        int j = 0; 
       
        // Doing same as done in Method 1 
        // Just maintaining another updated index i.e. j 
        for (int i = 0; i < n-1; i++) 
            if (arr[i] != arr[i+1]) 
                arr[j++] = arr[i]; 
       
        arr[j++] = arr[n-1]; 
       
        return j; 
    } 
  
}
