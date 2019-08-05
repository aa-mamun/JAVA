/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author MAMUN
 */

public class MIssingNumberInTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 4, 3, 5, 6,7};
        int[] b = {4, 1, 5, 3};
        findMissingNumber(a, b);
    }

    private static void findMissingNumber(int[] a, int[] b) {
        for (int n : a) {
            if (!isPresent(n, b)) {
                System.out.println("missing number: " + n);
                
            }
        }
    }

    private static boolean isPresent(int n, int[] b) {
        for (int i : b) {
            if (n == i) {
                System.out.print(+n +" ");// finding commmon numbers in two array
                return true;
                
            }
        }
        return false;
    }
    
    public int findMissingNumberVersionTWo(int[] arrOne, int[] arraTwo) {

        for (int i = 0; i < arrOne.length; i++) {
            boolean present = false;
            for (int j = 0; j < arraTwo.length; j++) {
                if (arrOne[i] == arraTwo[j]) {
                    present = true;
                }
            }
            if (present == false) {
                return arrOne[i];
            }
        }
        return arrOne[0];
    }
}