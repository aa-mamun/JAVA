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
public class RemoveElementFromArray {

    static void reverseArr(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArr(arr, start + 1, end - 1);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        reverseArr(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");

        }
        System.out.println("");
        int size = arr.length;
        System.out.println("Enter a number to delete ");
        int n = sc.nextInt();
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == n) {
                for (int j = i; j < (size - 1); j++) {
                    arr[j] = arr[j + 1];
                    
                }
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("The element is not found");
        } else {
            System.out.println("After deletion ");
            for (int i = 0; i < (size - 1); i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
