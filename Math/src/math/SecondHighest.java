/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.util.*;

/**
 *
 * @author MAMUN
 */
public class SecondHighest {
    
/*	public static void main(String[] args) {
 
		int[] arr = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
  
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
                           
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	} */
        
  /*      public static void main(String args[])
{ 
 
int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
 
  Arrays.sort(arr);
 
  System.out.println("Largest Number: "+arr[arr.length-1]);
  System.out.println("Second Largest Number: "+arr[arr  .length-2]);
 }
        
} */
    
    ///Using heap
    //The default PriorityQueue is implemented with Min-Heap, that is the top element is the minimum one in the heap
    //so min value will be the "HEAD"
   public static int findKthLargest(int arr[], int n) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(n);
        for (int i : arr) {
        q.offer(i); //insert in queue
            System.out.println(q);
            if (q.size() > n) { //return the number of elements
               
                q.poll(); //retreives head & removes it
                System.out.print("peak " +q +"----- ");
            }
        }

        return q.peek(); //retreives head but does not removes it
    }
    public static void main(String[] args) {
        int arr[] = { 14, 6, 47, 46,86, 92, 52, 48, 36, 66, 85 };
        int n =2;
        int result = findKthLargest(arr, n);
        System.out.println("nth highest number is "+ result);
        
    }
    }
//// nth highest can be calculated by Arrays.sort()    or by Heap 