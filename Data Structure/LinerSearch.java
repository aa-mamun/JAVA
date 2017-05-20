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
public class LinerSearch {
    public static void main(String[] args) {
        int index=-1;
        System.out.println("Enter how many numbers ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers");
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        
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
    }
}
