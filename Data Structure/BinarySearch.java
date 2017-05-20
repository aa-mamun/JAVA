                             /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class BinarySearch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int  search,  low, high, mid;
        int[] arr ={7,1,6,2,4,8};
        Arrays.sort(arr);
        System.out.println("Enter the search value:");
        search = sc.nextInt();

        low = 0;
        high = arr.length - 1;
        mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] < search) {
                low = mid + 1;
            } else if (arr[mid] == search) {
                System.out.println(search + " found at location " + (mid + 1) + ".");
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println(search + " is not found.\n");
        }
    }
}
