/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;
import java.util.*;

public class MaxMinAvg {

    public static void main(String args[]) {

        int sum = 0;
        int max = 0;
        int min = 0;
       
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers ?");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        // SUM
        System.out.print("Elements are : " + " ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
            sum += array[i];
        }
        System.out.println("\nSum is " + sum);

        //MAX
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max number is " + max);
    
        
        //MIN
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min number is " + min);
        
        //Avarage or MEAN
       
        System.out.println("Avarage is " + (sum/n));
        
        // ODD & EVEN
        
        /*
         public class TestEvenOdd {
public static void main(String arg[]){
int num=6;
int result=num;
while(result>=2){
result=result-2;
}
if(result==1){
System.out.println("The number is odd");
}else{
System.out.print("The number is even");
}
}
}*/
           if ((11 & 1) == 0) {
            System.out.println("EVEN NUMBER");
        } else {
            System.out.println("ODD NUMBER");
        }
           ////////////////////////
        
        if ( (11/2) * 2 == 11) {
            System.out.println("Even number **************");
        }
         else {
            System.out.println("Odd number ******************");
        }
        ////////////////////////
        System.out.print("Even numbers are :");
        for(int i=0; i<array.length;i++){
            if(array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
        
        System.out.print("\nOdd numbers are :");
        for(int i=0; i<array.length;i++){
            if(array[i] % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }
      
        // median = if number of elements is even then divide by 2  
                  // else if number of digits is odd then plus 1 then divide by 2
        int median=0;
        System.out.print("\nMedian is ");
        int elements=array.length;
        if(elements % 2 == 0)
        {
            median=elements/2;
        }
        else
            median=(elements+1)/2;
                  
        System.out.println(median + " th digit which is " + array[median-1] );
        
        //mode = the digit whic apper max time in the list 
                int modeCount = 0;	// The count of the mode value
		int mode = 0;		// The value of the mode
		int count = 0;	
		
		
		for (int i=0 ; i<array.length ; i++){
			count = 0;// Reset the number of times we have seen the current value
			for (int j=0; j<array.length; j++)
			{
				if (array[i] == array[j])
				{
					count++;
				}
			}
                        System.out.println( array[i]+ "occrued "+count + "times");
			if (count > modeCount)
			{
				modeCount = count;
				mode = array[i];
			}
		}
		
	System.out.println("\n Mode value is " + mode +" " + modeCount);
        
        // range = max -min
        System.out.println("\nRange is " + (max-min) );
        
    }
}
