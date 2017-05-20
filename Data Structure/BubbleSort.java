/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.*;

/**
 *
 * @author MAMUN
 */
public class BubbleSort{  
    static void bubbleSort(int[] arr) {  
        
         for(int i=0; i < arr.length; i++){              
                 for(int j=0; j < arr.length-1; j++){  
                          if(arr[j] > arr[j+1]){  
                                 //swap elements  
                               int  temp = arr[j];  
                                 arr[j] = arr[j+1];  
                                 arr[j+1] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,0,35,2,45,320,5,320};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i : arr){  
                        System.out.print(i + " ");  
                }  
   
        }  
}  