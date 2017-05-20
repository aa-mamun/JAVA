/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Arrays;

/**
Find The Continuous Sub Array In An Array Whose Sum Is Equal To Given Number?
* 
* Let inputArray be the given integer array and inputNumber be the given number. 
* First we initialize the sum to first element of the inputArray. Starting from the 
* second element, we go on adding each element of inputArray to sum one by one. 
* If the sum exceeds the inputNumber then we remove starting elements from the sum 
* until sum becomes either smaller than the inputNumber or equal to inputNumber. 
* If sum becomes equal to inputNumber then we print that sub array. 
* If sum becomes smaller than inputNumber, then we continue the execution of loop.
 */
public class SubArrayOfInpuNumber {
      static void findSubArray(int[] inputArray, int inputNumber)
    {

        int sum = inputArray[0];
        int start = 0;

        for (int i = 1; i < inputArray.length; i++)
        {
            sum = sum + inputArray[i];
 
            //If sum is greater than inputNumber then following loop is executed until
            //sum becomes either smaller than or equal to inputNumber
            while(sum > inputNumber && start <= i-1)
            {
                //Removing starting elements from the 'sum'
               // System.err.println(start);
               // System.err.println(inputArray[start]);
                sum = sum - inputArray[start];
                start++;
            }
 
            //If 'sum' is equal to 'inputNumber' then printing the sub array
 
            if(sum == inputNumber)
            {
                System.out.println("Continuous sub array of "+Arrays.toString(inputArray)+" whose sum is "+inputNumber+" is ");
 
                for (int j = start; j <= i; j++)
                {
                    System.out.print(inputArray[j]+" ");
                }
 
                System.out.println();
            }
        }
    }
 
    public static void main(String[] args)
    {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
 
        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);
 
        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 39);
    }
} 

