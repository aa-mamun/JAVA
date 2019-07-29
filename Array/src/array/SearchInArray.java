/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author MAMUN
 */
public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {45,1,4,0,6,90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element yu want to search");
        int n=sc.nextInt();
        int index=-1;
        
         System.out.println("Enter elemnt to search");
        int search = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search ){
                index=i;
                System.out.println("Found at location " + i);
               break;
            }
        }
        if(index==-1){
            System.out.println("Searched element is not found");
        }
        
        //Using Arrays
        Arrays.sort(arr);
        int index2 =Arrays.binarySearch(arr ,n);
        System.out.println(n + " found at " +index2);
        
        //using list
        
        List<Integer> list = Arrays.asList(12,23,34,4,5,6,78);
        if(list.contains(34)){
            System.out.println("Found");
        }
        
        Set<Integer> set = new HashSet<Integer>(list);
          if(set.contains(34)){
            System.out.println("Found");
        }
        
        String searchedString ="bad";
        String[] strArr = {"add" , "bad" ,"sad"};
        for(String check:strArr){
            if(check.equalsIgnoreCase(searchedString)){
                System.out.println(searchedString + " is found");
            }
        }
    }
}
