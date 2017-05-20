              /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author MAMUN
 */




public class MinMaxCollection {
   public static void main(String[] args) {
      Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
      int min = (int) Collections.min(Arrays.asList(numbers));
      int max = (int) Collections.max(Arrays.asList(numbers));
      System.out.println("Min number: " + min);
      System.out.println("Max number: " + max);
   }
}