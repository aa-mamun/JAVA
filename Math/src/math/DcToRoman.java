/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.util.Scanner;

/**
Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
 */
public class DcToRoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int temp = n;
        //13 elements // ROman range 1 to 3999
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        String roman ="";
        if(n>=1 && n<=3999){
            for (int i = 0; i < arr.length; i++) {
                while(n >= arr[i]){
                    n = n-arr[i];
                    roman += symbol[i];
                }
            }
            System.out.println("Roman Equivalent Of "+temp+" is : "+roman);
        }
        else
            System.out.println("Invalid number");
    }
}
